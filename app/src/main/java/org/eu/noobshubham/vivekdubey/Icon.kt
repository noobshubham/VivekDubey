package org.eu.noobshubham.vivekdubey

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "icons")
data class Icon(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val imageUrl: String,
    val destinationUrl: String
)

