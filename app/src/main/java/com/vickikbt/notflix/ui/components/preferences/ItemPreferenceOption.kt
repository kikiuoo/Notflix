package com.vickikbt.notflix.ui.components.preferences

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemPreferenceOption(
    modifier: Modifier = Modifier,
    optionText: String,
    selectedOption: Boolean = false,
    onOptionSelected: () -> Unit
) {

    Row(
        modifier = modifier.clickable { onOptionSelected() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        RadioButton(selected = selectedOption, onClick = { onOptionSelected() })

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = optionText,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onSurface,
            fontSize = 18.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Start
        )
    }


}