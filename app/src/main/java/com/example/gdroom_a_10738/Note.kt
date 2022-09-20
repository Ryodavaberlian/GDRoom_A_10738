package com.example.gdroom_a_10738

import androidx.room.PrimaryKey
import androidx.room.vo.PrimaryKey

data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)