package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<model>()
        //adding images
        list.add(model("Ghost","Ghost Riley,no one has ever seen his face",R.drawable.ghost))
        list.add(model("Captain","I don't know him",R.drawable.captaindude))
        list.add(model("Hellboy","He ain't the real hellboy but i Don't know his name",R.drawable.hellboy))
        list.add(model("Ghillieman","Best skin for sniping in the woods",R.drawable.ghillie))
        list.add(model("Gun dude","Don't even remember what he looks like",R.drawable.gunguy))
        list.add(model("Ghostboy","Another Ghost skin so that Activision can take my money",R.drawable.ghostman))

        listview.adapter=myadapter(this,R.layout.rows,list)

        listview.setOnItemClickListener { adapterView, view, position, l ->

            if (position==0){
                Toast.makeText(this@MainActivity,"Ghost will find you",Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You found Captain",Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"Wrong hellboy",Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You saw Ghillie",Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"Gun man majiiii",Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity,"Another Ghost",Toast.LENGTH_LONG).show()
            }
        }
    }
}