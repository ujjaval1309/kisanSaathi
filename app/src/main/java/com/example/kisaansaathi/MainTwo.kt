package com.example.kisaansaathi

import Notifications
import android.annotation.SuppressLint
import android.app.Notification
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.rounded.AddToHomeScreen
import androidx.compose.material.icons.rounded.Dashboard
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kisaansaathi.ui.theme.GreenJC
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Frontend() {
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    val selected = remember {
        mutableStateOf(Icons.Rounded.Home)
    }

    var age by remember{
        mutableStateOf(0)
    }


    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    contentAlignment = Alignment.BottomCenter,
                    modifier = Modifier
                        .background(GreenJC)
                        .fillMaxWidth()
                        .height(200.dp)
                ) {
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.seedling),
                            contentDescription = null,
                            modifier = Modifier
                                .height(70.dp)
                                .width(70.dp)
                        )
                        Text(
                            text = "Kissan Saathi",
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 30.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 30.dp, vertical = 30.dp)
                        )
                    }
                }
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Home", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Home,
                            contentDescription = "Home",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(
                    label = { Text(text = "Profile", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Person,
                            contentDescription = "Profile",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Profile.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(
                    label = { Text(text = "Register", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Dashboard,
                            contentDescription = "Register",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Search.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(
                    label = { Text(text = "Login", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.AddToHomeScreen,
                            contentDescription = "Login",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Settings.screen) {
                            popUpTo(0)
                        }
                    })
                NavigationDrawerItem(
                    label = { Text(text = "Logout", color = GreenJC) },
                    selected = false,
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.ExitToApp,
                            contentDescription = "Logout",
                            tint = GreenJC
                        )
                    },
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        Toast.makeText(context, "Log Out", Toast.LENGTH_SHORT).show()
                    })
            }
        },
    )
    {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Kissan Saathi",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 25.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 30.dp)
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                            navigationController.navigate(Screens.Home.screen) {
                                popUpTo(0)
                            }
                        })
                        {
                            Icon(
                                modifier = Modifier
                                    .height(30.dp)
                                    .width(30.dp),
                                imageVector = Icons.Rounded.List,
                                contentDescription = "Person",
                                tint = Color.White
                            )
                        }
                    },
                    actions = {

                        Box(
                                modifier = Modifier.size(55.dp),
                        contentAlignment = Alignment.TopEnd
                        ) {
                        Icon(
                            imageVector = Icons.Rounded.ShoppingCart,
                            contentDescription = null,tint = Color.White,
                            modifier = Modifier
                                .height(25.dp)
                                .width(25.dp)
                                .align(alignment = Alignment.Center)
                        )
                        Badge {
                            Text(
                                text = "$age", fontSize = 15.sp,fontWeight = FontWeight.Bold
                            )
                        }
                    }
                        IconButton(onClick = {
                                Toast.makeText(context,"Menu",Toast.LENGTH_SHORT).show()
                        }) {
                            Icon(
                                modifier = Modifier
                                    .height(25.dp)
                                    .width(25.dp),
                                imageVector = Icons.Rounded.MoreVert,
                                contentDescription = "Settings",
                                tint = Color.White
                            )
                        }
                    }, colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GreenJC,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    )
                )
            },
            bottomBar = {
                BottomAppBar(containerColor = GreenJC) {
                    IconButton(onClick = {
                        selected.value = Icons.Default.Home
                        navigationController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Home) Color.Yellow
                            else Color.White
                        )
                    }
//                        FloatingActionButton(onClick = { showBottomSheet=true}, modifier = Modifier.weight(1f)) {
//                            Icon(Icons.Default.Add, contentDescription = null, tint = GreenJC)
//                        }
                    IconButton(onClick = {
                        selected.value = Icons.Default.Notifications
                        navigationController.navigate(Screens.Notification.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Notifications) Color.Yellow
                            else Color.White
                        )
                    }
                    IconButton(onClick = {
                        selected.value = Icons.Default.ShoppingBag
                        navigationController.navigate(Screens.Posts.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            Icons.Default.ShoppingBag,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.ShoppingBag) Color.Yellow
                            else Color.White
                        )
                    }
                    IconButton(onClick = {
                        selected.value = Icons.Default.Person
                        navigationController.navigate(Screens.Profile.screen) {
                            popUpTo(0)
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Person) Color.Yellow
                            else Color.White
                        )
                    }


                }
            }


        ) {
            NavHost(
                navController = navigationController,
                startDestination = Screens.Home.screen
            ) {
                composable(Screens.Home.screen) { Home() }
                composable(Screens.Profile.screen) { Profile() }
                composable(Screens.Settings.screen) { Settings() }
                composable(Screens.Search.screen) { Search() }
                composable(Screens.Notification.screen) { Notifications() }
                composable(Screens.Posts.screen) { Posts() }
            }
        }
    }


}

