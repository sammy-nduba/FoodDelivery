package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Let's Talk\n Chicken",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Spicy Chicken",
            type = ProductHighlightType.PRIMARY
        ),
        ProductHighlightState(
            text = "Chicken",
            type = ProductHighlightType.SECONDARY
        )
    )
)