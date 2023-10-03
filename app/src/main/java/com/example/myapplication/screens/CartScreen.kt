package com.example.myapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.components.RoundIconButton

@Composable
fun Cart() {
	var index by remember { mutableStateOf(1) }
	var checked by remember { mutableStateOf(false) }
	val onCheckedChange : (Boolean) -> Unit = { checked = it }
	var checked1 by remember { mutableStateOf(false) }
	val onCheckedChange1 : (Boolean) -> Unit = { checked1 = it }
	var checked2 by remember { mutableStateOf(false) }
	val onCheckedChange2 : (Boolean) -> Unit = { checked2 = it }
	var checked3 by remember { mutableStateOf(false) }
	val onCheckedChange3 : (Boolean) -> Unit = { checked3 = it }
	var checked4 by remember { mutableStateOf(false) }
	val onCheckedChange4 : (Boolean) -> Unit = { checked4 = it }
	var checked5 by remember { mutableStateOf(false) }
	val onCheckedChange5 : (Boolean) -> Unit = { checked5 = it }

	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(top = 30.dp, bottom = 12.dp, start = 12.dp, end = 12.dp),
		horizontalArrangement = Arrangement.Start,
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(text = "Persons :", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
		Spacer(modifier = Modifier.width(20.dp))
		RoundIconButton(imageVector = Icons.Default.KeyboardArrowLeft, onclick = {
			if (index > 1) {
				index--
			}
		})
		Text(text = "$index")
		RoundIconButton(imageVector = Icons.Default.KeyboardArrowRight, onclick = {
			if (index < 5) {
				index++
			}
		})
	}
	LazyColumn(horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center,
		content = {
			item {
				Text(
					text = "Sousse",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked, onCheckedChange = onCheckedChange
				)
			}
			item {
				Text(
					text = "Monastir",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked1, onCheckedChange = onCheckedChange1
				)
			}
			item {
				Text(
					text = "Mahdia",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked2, onCheckedChange = onCheckedChange2
				)
			}
			item {
				Text(
					text = "Nabeul",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked3, onCheckedChange = onCheckedChange3
				)
			}
			item {
				Text(
					text = "Tunis",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked4, onCheckedChange = onCheckedChange4
				)
			}
			item {
				Text(
					text = "Benzart",
					fontWeight = FontWeight.Bold,
					fontSize = 18.sp,
					textAlign = TextAlign.Center,
					modifier = Modifier.fillMaxWidth()
				)
				Checkbox(
					checked = checked5, onCheckedChange = onCheckedChange5
				)
			}
		})
	Button(onClick = { /*TODO*/ }) {
		Text(text = "Reserve a hotel")
	}

}