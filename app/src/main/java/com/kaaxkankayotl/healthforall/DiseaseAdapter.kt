package com.kaaxkankayotl.healthforall

import android.app.Activity
import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class DiseaseAdapter(private var title:List<String>, private var images:List<Int>):
        RecyclerView.Adapter<DiseaseAdapter.ViewHolder>(){


       inner class ViewHolder( itemView:View, var title: String? = null) : RecyclerView.ViewHolder(itemView){

           var itemTitle: TextView = itemView.findViewById(R.id.disease_name)
           val itemPicture: ImageView = itemView.findViewById(R.id.disease_image)

       }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.disease_layout, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemPicture.setImageResource(images[position])
        holder.itemView.setOnClickListener {
            if (position  == 0){
                val intent = Intent(holder.itemView.context, activity_cancer::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if (position  == 1){
                val intent = Intent(holder.itemView.context, activity_diabetes::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if (position  == 2){
                val intent = Intent(holder.itemView.context, cvdlist::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if (position  == 3){
                val intent = Intent(holder.itemView.context, activity_osteoporosis::class.java)
                holder.itemView.context.startActivity(intent)
            }
            if (position  == 4){
                val intent = Intent(holder.itemView.context, activity_neurodegenerative::class.java)
                holder.itemView.context.startActivity(intent)
            }

        }


    }

    override fun getItemCount(): Int {
        return title.size
    }


}

