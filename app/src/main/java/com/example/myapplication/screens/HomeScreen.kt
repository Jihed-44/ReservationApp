package com.example.myapplication.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.model.Destination

@SuppressLint("RememberReturnType")
@Composable
fun Home() {
	var liked by remember { mutableStateOf(false) }
	val listOfDestinations = listOf(
		Destination(
			name = "Sousse",
			image = painterResource(id = R.drawable.sousse),
			isLiked = liked,
			likeIcon = Icons.Filled.FavoriteBorder
		), Destination(
			name = "Monastir",
			image = painterResource(id = R.drawable.monastir),
			isLiked = liked,
			likeIcon = Icons.Default.FavoriteBorder
		), Destination(
			name = "Mahdia",
			image = painterResource(id = R.drawable.mahdia),
			isLiked = liked,
			likeIcon = Icons.Default.FavoriteBorder
		), Destination(
			name = "Nabeul",
			image = painterResource(id = R.drawable.nabeul),
			isLiked = liked,
			likeIcon = Icons.Default.FavoriteBorder
		), Destination(
			name = "Tunis",
			image = painterResource(id = R.drawable.tunis),
			isLiked = liked,
			likeIcon = Icons.Default.FavoriteBorder
		), Destination(
			name = "Benzart",
			image = painterResource(id = R.drawable.benzart),
			isLiked = liked,
			likeIcon = Icons.Default.FavoriteBorder
		)
	)
	Text(
		text = "Our Most Visited Destinations !",
		fontSize = 25.sp,
		fontWeight = FontWeight.ExtraBold,
		color = Color.Magenta
	)
	LazyColumn(modifier = Modifier
		.padding(16.dp)
		.clip(RoundedCornerShape(16.dp))
		.fillMaxSize()
		.background(Color(0xFFFBB3BD)),
		contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp),
		content = {
			items(listOfDestinations) { destination ->
				Column(
					verticalArrangement = Arrangement.Center,
					horizontalAlignment = Alignment.CenterHorizontally
				) {
					Text(
						modifier = Modifier
							.padding(2.dp)
							.fillMaxWidth(),
						fontWeight = FontWeight.Bold,
						text = destination.name,
						textAlign = TextAlign.Center
					)
					IconToggleButton(checked = liked, onCheckedChange = { liked = it }) {
						val color by animateColorAsState(
							targetValue = if (liked) Color(0xffE91E63) else Color(0xffB0BEC5),
							animationSpec = tween(durationMillis = 400),
							label = ""
						)

						Icon(
							Icons.Filled.Favorite, tint = color, contentDescription = null
						)
					}
				}

				Box(modifier = Modifier
					.fillMaxWidth()
					.height(250.dp)
					.padding(horizontal = 16.dp)
					.clip(RoundedCornerShape(25.dp))
					.clickable { }
					.background(color = Color(0xFFFBB3BD))) {
					Image(
						contentScale = ContentScale.Crop,
						modifier = Modifier
							.fillMaxWidth()
							.height(250.dp)
							.clip(RoundedCornerShape(25.dp))
							.clickable {},
						painter = destination.image,
						contentDescription = null
					)
				}
				Spacer(modifier = Modifier.height(20.dp))
			}
		})
}