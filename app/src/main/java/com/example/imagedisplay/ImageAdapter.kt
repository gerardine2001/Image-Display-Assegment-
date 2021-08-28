package com.example.imagedisplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewConfiguration.get
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.lang.reflect.Array.get
import java.nio.file.Paths.get

class ImageAdapter(var imagedisplay:List<ImageAdapter>):RecyclerView.Adapter<ImageViewCompat>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.image_list,parent,false)
        return  ImageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        var myImage=Imagelist.get(position)
        holder.etName.text=myImage.name
        holder.etlikes.text=myImage.liks
        Picasso.get().load(myImage.imageUrl).resize(100,100).placeholder(R.drawable.holder).into(holder.imgUrl)
        holder.etName.setOnClickListener{

    }

    override fun getItemCount(): Int {
     return  imagedisplay.size
    }
}
class ImageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var etName=itemView.findViewById<TextView>(R.id.tvName)
    var etlikes=itemView.findViewById<TextView>(R.id.tvLikes)
    var imgUrl=itemView.findViewById<ImageView>(R.id.ImgUrl)
}