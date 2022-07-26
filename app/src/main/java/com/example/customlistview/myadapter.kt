package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myadapter(var mctx:Context,var resources:Int,var items:List<model>):ArrayAdapter<model>(mctx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflator:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflator.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val title:TextView=view.findViewById(R.id.Txt_main)
        val description:TextView=view.findViewById(R.id.Txt_sub)

        var mitem:model=items[position]
        imageview.setImageDrawable(mctx.resources.getDrawable(mitem.img))
        title.text=mitem.tittle
        description.text=mitem.description

        return view
    }
}