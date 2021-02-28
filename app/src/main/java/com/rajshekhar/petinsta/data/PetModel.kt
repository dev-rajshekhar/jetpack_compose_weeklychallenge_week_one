package com.rajshekhar.petinsta.data

data class PetModel(
    val name: String,
    val breedName: String,
    val age: Double,
    val isFemale: Boolean,
    val description: String,
    val location: String,
    val weight: Double,
    val owner: String
)