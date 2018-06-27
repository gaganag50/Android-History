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
        Log.d("RecyleAct", "" + position)
        val version = versions[position]
        holder.versionImage.setImageResource(version.imageResId)
        holder.versionName.text = version.versionName
        holder.versionNumber.text = "Version No:${version.versionNumber}"
        holder.APILevel.text = "API: ${version.APILevel}"
    }

    class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val versionImage = itemView.image
        val versionName = itemView.tvVersionName
        val versionNumber = itemView.tvVersionNumber
        val APILevel = itemView.tvAPILevel


    }

}
