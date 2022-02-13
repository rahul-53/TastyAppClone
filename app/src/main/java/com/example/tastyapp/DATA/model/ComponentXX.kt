package com.example.TastyApp.DATA.model

data class ComponentXX(
    val extra_comment: String,
    val id: Int,
    val ingredient: IngredientXX,
    val measurements: List<MeasurementXX>,
    val position: Int,
    val raw_text: String
)