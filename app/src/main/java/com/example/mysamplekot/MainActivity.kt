package com.example.mysamplekot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 val mFlowersList: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFlowersList.add("Rose")
        mFlowersList.add("Lilly")
        mFlowersList.add("Jasmine")
        mFlowersList.add("Lotus")
        mFlowersList.add("Sun Flower")
        flowers_list.layoutManager = LinearLayoutManager(this)
        flowers_list.adapter = MyAdapter(mFlowersList, this)
    }
}
