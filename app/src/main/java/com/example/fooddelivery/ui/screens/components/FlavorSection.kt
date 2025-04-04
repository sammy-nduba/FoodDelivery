package com.example.fooddelivery.ui.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.ProductFlavorState
import com.example.fooddelivery.data.ProductFlavorsData
import com.example.fooddelivery.ui.theme.AppTheme


@Composable
fun FlavorSection(
    modifier: Modifier = Modifier,
    data: List<ProductFlavorState>
) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            title = "Spice Up",
            emotion = "\uD83C\uDF35\uD83C\uDF35"
        )
    }
}

@Composable
private fun SectionHeader(
    modifier: Modifier = Modifier,
    title: String,
    emotion: String
){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp),

    ){
        Text(text = title,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground
        )

        Text(text = emotion,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground
        )
    }
}

@Composable
fun ProductFlavorItem(
    modifier: Modifier = Modifier,
    state: ProductFlavorState
){
    Box(modifier = Modifier.shadow(elevation = 10.dp,
        spotColor = Color.LightGray,
        shape = RoundedCornerShape(28)
        )
        .background(shape = RoundedCornerShape(28), color = AppTheme.colors.regularSurface)
    ){

    }
}