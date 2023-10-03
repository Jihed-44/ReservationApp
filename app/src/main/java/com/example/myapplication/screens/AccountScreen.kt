package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.components.MailField
import com.example.myapplication.components.NameField
import com.example.myapplication.components.NumberField

@Composable
fun Account() {
	Column(
		modifier = Modifier
			.padding(16.dp)
			.clip(RoundedCornerShape(16.dp))
			.background(Color(0xFFFBB3BD))
	) {
		NameField { }
		MailField { }
		NumberField { }
	}
}