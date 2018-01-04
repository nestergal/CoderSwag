package com.nestergal.coderswag.Services

import com.nestergal.coderswag.Model.Category
import com.nestergal.coderswag.Model.Product

/**
 * Created by neste on 1/4/2018.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category ("HOODIES", "hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$18","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Rad", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$22", "hoodie02")

    )
    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20 ", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip Studios", "$18", "shirt05")
    )
}
