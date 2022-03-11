package com.clase.facebook

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val publicacionList: ArrayList<Publicacion>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(publicacionList[position])
    }

    override fun getItemCount(): Int {
        return publicacionList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publicacion,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItem(publicacion: Publicacion){
            val id = itemView.findViewById(R.id.id) as TextView
            val nombre = itemView.findViewById(R.id.nombre) as TextView
            val usuario = itemView.findViewById(R.id.usuario) as TextView
            val hora = itemView.findViewById(R.id.hora) as TextView
            val likes = itemView.findViewById(R.id.likes) as TextView
            val texto = itemView.findViewById(R.id.texto) as TextView
            val comentarios = itemView.findViewById(R.id.comentarios) as TextView
        }
    }
}