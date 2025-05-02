package com.trabalhoandroid.projetoteladodeezer.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Album
import androidx.compose.material.icons.filled.Audiotrack
import androidx.compose.material.icons.filled.Create
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.trabalhoandroid.projetoteladodeezer.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Música",
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
                            .clickable {}
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
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(25.dp)
                        .clickable {
                            navController.navigate("searchScreen")
                        }
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
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(15.dp)
        ) {
            Text(
                text = "Seus artistas favoritos",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.g3),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.gr),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.jc),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.resgate),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Image(
                    painter = painterResource(R.drawable.hil),
                    contentDescription = "",
                    modifier = Modifier
                        .size(75.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
            }
            Text(
                text = "Feito para você",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 20.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.g3),
                    contentDescription = "",
                    modifier = Modifier
                        .size(200.dp)
                        .aspectRatio(1f)
                        .padding(5.dp)
                )
                Image(
                    painter = painterResource(R.drawable.gr),
                    contentDescription = "",
                    modifier = Modifier
                        .size(200.dp)
                        .aspectRatio(1f)
                        .padding(5.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.jc),
                    contentDescription = "",
                    modifier = Modifier
                        .size(200.dp)
                        .aspectRatio(1f)
                        .padding(5.dp)
                )
                Image(
                    painter = painterResource(R.drawable.resgate),
                    contentDescription = "",
                    modifier = Modifier
                        .size(200.dp)
                        .aspectRatio(1f)
                        .padding(5.dp)
                )
            }
        }
    }
}



@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = NavController(LocalContext.current))
}