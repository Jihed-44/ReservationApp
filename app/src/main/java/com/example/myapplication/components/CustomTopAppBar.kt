package com.example.myapplication.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {
	TopAppBar(title = {
		Box(
			modifier = Modifier.fillMaxWidth(), Alignment.Center
		) {
			Text(
				text = "Trip App",
				fontSize = 18.sp,
				fontWeight = FontWeight.ExtraBold,
				textAlign = TextAlign.Center,
				modifier = Modifier.fillMaxWidth()
			)
		}
	},
		navigationIcon = {
			IconButton(onClick = { /*TODO*/ }) {
				Icon(
					imageVector = Icons.Default.Menu, contentDescription = null
				)
			}
		},
		colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFFE9EE)),
		modifier = Modifier
			.padding(vertical = 10.dp, horizontal = 16.dp)
			.clip(RoundedCornerShape(16.dp)),
		actions = {
			IconButton(onClick = { /*TODO*/ }) {
				Icon(
					imageVector = Icons.Default.Favorite, contentDescription = null
				)
			}
			IconButton(onClick = { /*TODO*/ }) {
				Icon(
					imageVector = Icons.Default.Notifications, contentDescription = null
				)
			}
		})
}