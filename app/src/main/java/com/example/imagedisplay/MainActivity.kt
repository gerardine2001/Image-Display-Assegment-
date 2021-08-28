package com.example.imagedisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvImage:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayImage()
    }

    fun displayImage(){
        var imagelist= listOf<Imagelist>(
            Imagelist("Uwase Jeannine",56,"https://image.shutterstock.com/mosaic_250/2797510/1617540484/stock-photo-closeup-photo-of-amazing-short-hairdo-lady-looking-up-empty-space-deep-thinking-creative-person-arm-1617540484.jpg"),
            Imagelist("Uwineza mutesi",56,"https://image.shutterstock.com/image-photo/close-photo-beautiful-amazing-she-260nw-1403464760.jpg"),
            Imagelist("Uwiduhaye Murenzi",67,"https://wallpaperaccess.com/full/945374.jpg"),

        )
        rvImage=findViewById(R.id.rvImage)
        var ImageAdapter=ImageAdapter(imagelist,baseContext)
        rvImage.layoutManager= LinearLayoutManager(baseContext)
        rvImage.adapter=ImageAdapter


    }
}