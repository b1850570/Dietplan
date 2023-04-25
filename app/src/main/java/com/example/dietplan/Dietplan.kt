package com.example.dietplan

data class Dietplan(
    val name: String,
    val description: String,
    val Meals: List<Meal>
)
 data class Meal(
     val name: String,
     val description: String,
     val Calories: Int,
     val Carbohydrates: Int,
     val Fats: Int,
     val Proteins: Int
 )