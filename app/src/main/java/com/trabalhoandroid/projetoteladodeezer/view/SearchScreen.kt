package com.trabalhoandroid.projetoteladodeezer.view

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Audiotrack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SearchScreen(navController: NavController) {
    var busca by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Busca",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                            .clickable {
                                navController.navigate("homeScreen")
                            }
                    )
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                            .clickable {}
                    )
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                            .clickable {}
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {}
                )
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {}
                )
                Icon(
                    imageVector = Icons.Default.Audiotrack,
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {}
                )
                Icon(
                    imageVector = Icons.Default.Save,
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {}
                )
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {}
                )
            }
        }

    ) {paddingValues ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(paddingValues)
                .padding(top = 0.dp, bottom = 0.dp, start = 50.dp, end = 10.dp)
        ){
            OutlinedTextField(
                value = busca,
                onValueChange = {
                    busca = it
                },
                label = {
                    Text(text = "Artistas,faixas,podcats...")
                },
            )
        }

    }
}


@Preview
@Composable
fun SearchScreenPreview(){
    SearchScreen( navController = NavController(LocalContext.current))
}