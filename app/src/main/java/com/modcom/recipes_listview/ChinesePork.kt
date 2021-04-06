package com.modcom.recipes_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chinese_pork.*

class ChinesePork : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinese_pork)
        //here i need to do a HTML page, right click on app, then New- Folder - Assets
        chinesewebview.loadUrl("file:///android_asset/chinesepork.html")
    }
}