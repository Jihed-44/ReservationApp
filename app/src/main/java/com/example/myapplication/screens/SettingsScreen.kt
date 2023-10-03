package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomSlider() {
	var sliderState by remember { mutableStateOf(0f) }
	Row {
		Slider(modifier = Modifier.width(200.dp), value = sliderState, onValueChange = { newState ->
			sliderState = newState
		})
		Text(
			text = "%${(sliderState * 100).toInt()} ",
			fontSize = 20.sp,
			fontWeight = FontWeight.Bold
		)
	}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSettings() {
	var switched by remember { mutableStateOf(false) }
	val onSwitchedChange : (Boolean) -> Unit = { switched = it }
	var switched2 by remember { mutableStateOf(false) }
	val onSwitchedChange2 : (Boolean) -> Unit = { switched2 = it }
	var checked by remember { mutableStateOf(true) }
	val onCheckedChange : (Boolean) -> Unit = { checked = it }
	var switched3 by remember { mutableStateOf(false) }
	val onSwitchedChange3 : (Boolean) -> Unit = { switched3 = it }
	var checked3 by remember { mutableStateOf(true) }
	val onCheckedChange3 : (Boolean) -> Unit = { checked3 = it }
	var checked2 by remember { mutableStateOf(true) }
	val onCheckedChange2 : (Boolean) -> Unit = { checked2 = it }
	LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top,
		modifier = Modifier
			.fillMaxSize()
			.background(Color(0xFFECECEC)),
		content = {
			item() {
				Divider()
				ListItem(headlineText = { Text(text = "Luminosity") },
					trailingContent = { CustomSlider() },
					modifier = Modifier.toggleable(
						value = checked, onValueChange = onCheckedChange
					)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Switch") }, trailingContent = {
					Switch(
						checked = switched, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = switched, onValueChange = onSwitchedChange
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Check") }, trailingContent = {
					Checkbox(
						checked = checked, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = checked, onValueChange = onCheckedChange
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text(text = "Contrast") },
					trailingContent = { CustomSlider() },
					modifier = Modifier.toggleable(
						value = checked, onValueChange = onCheckedChange
					)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Switch") }, trailingContent = {
					Switch(
						checked = switched2, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = switched2, onValueChange = onSwitchedChange2
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Check") }, trailingContent = {
					Checkbox(
						checked = checked2, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = checked2, onValueChange = onCheckedChange2
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text(text = "Luminosity") },
					trailingContent = { CustomSlider() },
					modifier = Modifier.toggleable(
						value = checked, onValueChange = onCheckedChange
					)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Switch") }, trailingContent = {
					Switch(
						checked = switched3, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = switched3, onValueChange = onSwitchedChange3
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text("Check") }, trailingContent = {
					Checkbox(
						checked = checked3, onCheckedChange = null
					)
				}, modifier = Modifier.toggleable(
					value = checked3, onValueChange = onCheckedChange3
				)
				)
				Divider()
			}
			item() {
				ListItem(headlineText = { Text(text = "Contrast") },
					trailingContent = { CustomSlider() },
					modifier = Modifier.toggleable(
						value = checked, onValueChange = onCheckedChange
					)
				)
				Divider()
			}
		})
}