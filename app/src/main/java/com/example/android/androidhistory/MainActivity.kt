package com.example.android.androidhistory

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvAndroidVersions.layoutManager = LinearLayoutManager(this)
        rvAndroidVersions.adapter = RecylerViewAdapter(populateList(this@MainActivity))
        rvAndroidVersions.addItemDecoration(DividerItemDecoration(
                rvAndroidVersions.getContext(),
                DividerItemDecoration.VERTICAL
        ))

    }
}
