package com.example.olx_original

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.olx_original.databinding.ElonSampleBinding

class ElonRecyclerAdapter : RecyclerView.Adapter<ElonRecyclerAdapter.MyViewHolder>() {
    val elonlar = Elon.getElonlar2()
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById<ImageView>(R.id.elon_image)
        var name = itemView.findViewById<TextView>(R.id.elon_name)
        var price = itemView.findViewById<TextView>(R.id.elon_narxi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ElonSampleBinding.inflate(LayoutInflater.from(parent.context))
        return  MyViewHolder(view.root)
    }

    override fun getItemCount(): Int {
        return elonlar.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val elon = elonlar[position]
        holder.name.text = elon.nomi
        holder.price.text = elon.narxi.toString()
        holder.image.setImageResource(R.drawable.s23)
    }

}