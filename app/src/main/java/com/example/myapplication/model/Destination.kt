package com.example.myapplication.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class Destination(
	val name : String,
	val image : Painter,
	var isLiked : Boolean,
	val likeIcon : ImageVector
)
