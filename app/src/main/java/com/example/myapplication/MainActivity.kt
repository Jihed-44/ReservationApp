package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import com.example.myapplication.components.CustomTopAppBar
import com.example.myapplication.screens.Home
import com.example.myapplication.screens.Account
import com.example.myapplication.screens.Cart
import com.example.myapplication.screens.Search
import com.example.myapplication.screens.AppSettings

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MyApp()
		}
	}
}
@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
	val keyBoardController = LocalSoftwareKeyboardController.current
	var navigationBarState by remember {
		mutableStateOf("Home")
	}
	Scaffold(topBar = { CustomTopAppBar() }, content = { innerPadding ->
		Column(horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.Top,
			modifier = Modifier
				.fillMaxSize()
				.padding(innerPadding)
				.clickable(
					interactionSource = remember { MutableInteractionSource() }, indication = null
				) {
					keyBoardController?.hide()
				}) {
			if (navigationBarState == "Home") {
				Home()
			}
			if (navigationBarState == "Search") {
				Search()
			}
			if (navigationBarState == "Account") {
				Account()
			}
			if (navigationBarState == "Settings") {
				AppSettings()
			}
			if (navigationBarState == "Cart") {
				Cart()
			}
		}
	}, bottomBar = {
		NavigationBar(
			containerColor = Color(0xFFFFE9EE),
			modifier = Modifier
				.padding(6.dp)
				.clip(RoundedCornerShape(30.dp))
		) {
			NavigationBarItem(
				selected = navigationBarState == "Home",
				onClick = { navigationBarState = "Home" },
				icon = {
					Icon(
						imageVector = if (navigationBarState == "Home") {
							Icons.Filled.Home
						} else Icons.Outlined.Home, contentDescription = null
					)
				},
				label = { Text(text = "Home") },
				alwaysShowLabel = false
			)
			NavigationBarItem(
				selected = navigationBarState == "Search",
				onClick = { navigationBarState = "Search" },
				icon = {
					Icon(
						imageVector = if (navigationBarState == "Search") {
							Icons.Filled.Search
						} else Icons.Outlined.Search, contentDescription = null
					)
				},
				label = { Text(text = "Search") },
				alwaysShowLabel = false
			)
			NavigationBarItem(
				selected = navigationBarState == "Account",
				onClick = { navigationBarState = "Account" },
				icon = {
					Icon(
						imageVector = if (navigationBarState == "Account") {
							Icons.Filled.AccountCircle
						} else Icons.Outlined.AccountCircle, contentDescription = null
					)
				},
				label = { Text(text = "Account") },
				alwaysShowLabel = false
			)
			NavigationBarItem(
				selected = navigationBarState == "Settings",
				onClick = { navigationBarState = "Settings" },
				icon = {
					Icon(
						imageVector = if (navigationBarState == "Settings") {
							Icons.Filled.Settings
						} else Icons.Outlined.Settings, contentDescription = null
					)
				},
				label = { Text(text = "Settings") },
				alwaysShowLabel = false
			)
			NavigationBarItem(
				selected = navigationBarState == "Cart",
				onClick = { navigationBarState = "Cart" },
				icon = {
					Icon(
						imageVector = if (navigationBarState == "Cart") {
							Icons.Filled.ShoppingCart
						} else Icons.Outlined.ShoppingCart, contentDescription = null
					)
				},
				label = { Text(text = "Browse") },
				alwaysShowLabel = false
			)
		}
	})
}