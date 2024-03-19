package com.example.ttmapsfav.models

import java.io.Serializable

data class UserMap(
    var title: String,
    val places: List<Place>
):Serializable
