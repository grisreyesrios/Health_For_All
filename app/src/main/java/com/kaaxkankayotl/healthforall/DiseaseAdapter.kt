package com.kaaxkankayotl.healthforall

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView


class DiseaseAdapter(private var title:List<String>, private var images:List<Int>):
        RecyclerView.Adapter<DiseaseAdapter.ViewHolder>(){

       inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

           val itemTitle: TextView = itemView.findViewById(R.id.disease_name)
           val itemPicture: ImageView = itemView.findViewById(R.id.disease_image)


           init {
               itemView.setOnClickListener { v: View? ->



               }
           }

       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.disease_layout, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemPicture.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }


}