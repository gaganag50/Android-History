package com.example.android.androidhistory

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_versions.view.*

class RecylerViewAdapter(val versions: ArrayList<version>) : RecyclerView.Adapter<RecylerViewAdapter.AndroidViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder {
        Log.d("RecyleAct", versions.toList().toString())
        Log.d("RecyleAct", "" + versions.size)

        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.activity_versions, parent, false)
        return AndroidViewHolder(itemView)
    }

    override fun getItemCount(): Int = versions.size


    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {

        val version = versions[position]
        holder.bind(version)
    }

    class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ver: version) {
            itemView.image.setImageResource(ver.imageResId)
            itemView.btnVersionName.text = ver.versionName
            itemView.tvVersionNumber.setText("Version No:${ver.versionNumber}")
            itemView.tvAPILevel.setText("API: ${ver.APILevel}")
        }

    }

}
