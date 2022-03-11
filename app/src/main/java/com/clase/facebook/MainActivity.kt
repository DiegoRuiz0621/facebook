package com.clase.facebook

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val publicaciones = ArrayList<Publicacion>()
        publicaciones.add(Publicacion(1, "Hideo Kojima","Nuevo Silent Hill!!!", "HideoKojimaES", 9500, 500, 12))
        publicaciones.add(Publicacion(2, "Hideo Kojima","Nuevo Silent Hill!!!", "HideoKojimaES", 9500, 500, 12))
        publicaciones.add(Publicacion(3, "Hideo Kojima","Nuevo Silent Hill!!!", "HideoKojimaES", 9500, 500, 12))
        publicaciones.add(Publicacion(4, "Hideo Kojima","Nuevo Silent Hill!!!", "HideoKojimaES", 9500, 500, 12))

        val adapter = MyAdapter(publicaciones)
        recyclerView.adapter = adapter
    }
}