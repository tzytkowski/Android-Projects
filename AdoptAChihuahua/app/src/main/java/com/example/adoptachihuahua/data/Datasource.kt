package com.example.adoptachihuahua.data

import com.example.adoptachihuahua.R
import com.example.adoptachihuahua.model.Chihuahua

class Datasource {
    fun loadChihuahuas(): List<Chihuahua> {
        return listOf<Chihuahua>(
            Chihuahua(R.string.chihuahua1, R.drawable.image1),
            Chihuahua(R.string.chihuahua2, R.drawable.image2),
            Chihuahua(R.string.chihuahua3, R.drawable.image3),
            Chihuahua(R.string.chihuahua4, R.drawable.image4),
            Chihuahua(R.string.chihuahua5, R.drawable.image5),
            Chihuahua(R.string.chihuahua6, R.drawable.image6),
            Chihuahua(R.string.chihuahua7, R.drawable.image7),
            Chihuahua(R.string.chihuahua8, R.drawable.image8),
            Chihuahua(R.string.chihuahua9, R.drawable.image9),
            Chihuahua(R.string.chihuahua10, R.drawable.image10),
            Chihuahua(R.string.chihuahua11, R.drawable.image11),
            Chihuahua(R.string.chihuahua12, R.drawable.image12),
            Chihuahua(R.string.chihuahua13, R.drawable.image13),
            Chihuahua(R.string.chihuahua14, R.drawable.image14),
            Chihuahua(R.string.chihuahua15, R.drawable.image15)
        )
    }
}