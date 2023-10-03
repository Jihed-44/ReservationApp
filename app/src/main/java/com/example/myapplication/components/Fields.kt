package com.example.myapplication.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun RoundIconButton(
	modifier : Modifier = Modifier,
	imageVector : ImageVector,
	onclick : () -> Unit,
	tint : Color = Color.Black.copy(alpha = 0.8f)
) {
	IconButton(
		onClick = onclick,
		modifier = modifier,
	) {
		Icon(
			imageVector = imageVector, contentDescription = null, tint = tint
		)
	}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameField(
	onHide : () -> Unit
) {
	var name by remember { mutableStateOf("") }
	val validName = remember(name) { name.trim().isNotEmpty() }
	Column(
		modifier = Modifier
			.padding(16.dp)
			.fillMaxWidth()
			.clip(shape = RoundedCornerShape(12.dp))
	) {
		OutlinedTextField(
			singleLine = true,
			value = name,
			label = {
				Text(text = "Enter UserName")
			},
			onValueChange = {
				name = it
			},
			keyboardOptions = KeyboardOptions(
				keyboardType = KeyboardType.Text,
				imeAction = ImeAction.Next,
			),
			keyboardActions = KeyboardActions(onDone = {
				if (!validName || name.toInt() < 0) return@KeyboardActions
				else onHide()
			}),
			leadingIcon = {
				Icon(
					imageVector = Icons.Default.Person, contentDescription = null
				)
			},
			modifier = Modifier
				.padding(16.dp)
				.fillMaxWidth(),
		)
	}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MailField(
	onHide : () -> Unit
) {
	var mail by remember { mutableStateOf("") }
	val validMail = remember(mail) { mail.trim().isNotEmpty() }
	Column(
		modifier = Modifier
			.padding(16.dp)
			.fillMaxWidth()
			.clip(shape = RoundedCornerShape(12.dp))
	) {
		OutlinedTextField(
			singleLine = true,
			value = mail,
			label = {
				Text(text = "Enter E-Mail")
			},
			onValueChange = {
				mail = it
			},
			keyboardOptions = KeyboardOptions(
				keyboardType = KeyboardType.Email,
				imeAction = ImeAction.Next,
			),
			keyboardActions = KeyboardActions(onDone = {
				if (!validMail || mail.toInt() < 0) return@KeyboardActions
				else onHide()
			}),
			leadingIcon = {
				Icon(
					imageVector = Icons.Default.Email, contentDescription = null
				)
			},
			modifier = Modifier
				.padding(16.dp)
				.fillMaxWidth(),
		)
	}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberField(
	onHide : () -> Unit
) {
	var number by remember { mutableStateOf("") }
	val validNumber = remember(number) { number.trim().isNotEmpty() }
	Column(
		modifier = Modifier
			.padding(16.dp)
			.fillMaxWidth()
			.clip(shape = RoundedCornerShape(12.dp))
	) {
		OutlinedTextField(
			singleLine = true,
			value = number,
			label = {
				Text(text = "Enter PhoneNumber")
			},
			onValueChange = {
				number = it
			},
			keyboardOptions = KeyboardOptions(
				keyboardType = KeyboardType.Number,
				imeAction = ImeAction.Done,
			),
			keyboardActions = KeyboardActions(onDone = {
				if (!validNumber || number.toInt() < 0) return@KeyboardActions
				else onHide()
			}),
			leadingIcon = {
				Icon(
					imageVector = Icons.Default.Phone, contentDescription = null
				)
			},
			modifier = Modifier
				.padding(16.dp)
				.fillMaxWidth(),
		)
	}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchField(
	onHide : () -> Unit
) {
	var search by remember { mutableStateOf("") }
	val validSearch = remember(search) { search.trim().isNotEmpty() }
	Column(
		modifier = Modifier
			.padding(16.dp)
			.fillMaxWidth()
			.clip(shape = RoundedCornerShape(12.dp))
	) {
		OutlinedTextField(
			singleLine = true,
			value = search,
			label = {
				Text(text = "Search Here")
			},
			onValueChange = {
				search = it
			},
			keyboardOptions = KeyboardOptions(
				keyboardType = KeyboardType.Text,
				imeAction = ImeAction.Search,
			),
			keyboardActions = KeyboardActions(onDone = {
				if (!validSearch || search.toInt() < 0) return@KeyboardActions
				else onHide()
			}),
			leadingIcon = {
				Icon(
					imageVector = Icons.Default.Search, contentDescription = null
				)
			},
			modifier = Modifier
				.padding(16.dp)
				.fillMaxWidth(),
		)
	}
}