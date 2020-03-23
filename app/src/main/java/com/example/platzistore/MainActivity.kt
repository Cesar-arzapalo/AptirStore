package com.example.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager=GridLayoutManager(this,2)
        val itemShop=(0..20).map{
            ItemLanding("Titulo $it","Descr $it",200.00*(it+1))
        }

        val adapter = AdapterLanding(itemShop)

        rcViewLanding.adapter=adapter
    }
}
