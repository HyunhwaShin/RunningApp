package com.example.runningtracker.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverters
import java.io.ByteArrayOutputStream

class Converters {
    @TypeConverters
    fun toBitmap(bytes :ByteArray) : Bitmap {

        return BitmapFactory.decodeByteArray(bytes,0,bytes.size)
    }

    @TypeConverters
    fun fromBitmap(bmp :Bitmap) : ByteArray {

        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)

        return outputStream.toByteArray()
    }
}