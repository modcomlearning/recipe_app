package com.modcom.recipes_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foods = arrayOf("Chinese Pork Ribs","Dump Cake","Sugar Cookies","Korean Rice Cakes","Creamed Candy Corn")
        val arrayAdapter: ArrayAdapter<*>

        //use the adapter to get items from the list
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foods)

        //You now apply the adapter to listview
        listrecipes.adapter = arrayAdapter

        ///make other activities
        listrecipes.onItemClickListener = AdapterView.OnItemClickListener{
            parent, view, position, id->
            if (position == 0){
                //chinese pork
                val pork = Intent(applicationContext, ChinesePork::class.java)
                startActivity(pork)
            }

            if (position ==1){
                //dump cake
            }

            if (position == 2){
                //todo
            }
        }//ends on click

    }//ends the oncreate
}//ends class