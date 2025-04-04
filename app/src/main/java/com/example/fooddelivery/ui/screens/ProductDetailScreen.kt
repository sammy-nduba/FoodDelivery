package com.example.fooddelivery.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.ProductFlavorState
import com.example.fooddelivery.data.ProductFlavorsData
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.screens.components.FlavorSection
import com.example.fooddelivery.ui.screens.components.ProductPreviewSection

@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorsData
) {

    val scrollableState = rememberScrollState()

    Column(
    modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )

        Spacer(modifier = Modifier.height(16.dp))

        FlavorSection(
            modifier = modifier.padding(horizontal = 18.dp),
            data = productFlavors
        )
    }
}

@Preview
@Composable
fun ProductDetailScreenPreview() {
    ProductDetailScreen()
}