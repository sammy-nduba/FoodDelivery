package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R


data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int


)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        name = "Spicy Chicken",
        price = "Ksh 250",
        imgRes = R.drawable.img_burger

    ),
    ProductFlavorState(
        name = "Donuts",
        price = "$10",
        imgRes = R.drawable.img_burger
    ),
    ProductFlavorState(
        name = "Cakes",
        price = "$10",
        imgRes = R.drawable.img_burger
    ),
)
