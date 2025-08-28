package com.example.projectmanager.adapter


import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectmanager.R
import com.example.projectmanager.domain.OngoingDomain
import com.example.projectmanager.domain.TeamDomain

class ArchiveAdapter(private val items: List<String>) :
    RecyclerView.Adapter<ArchiveAdapter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_archive, parent, false)
        return Viewholder(view)

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        // Set item data

        val item = items[position]
        holder.title.text = item

    }

    override fun getItemCount(): Int = items.size

    // ViewHolder class

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Declare views from the layout

        val title: TextView = itemView.findViewById(R.id.titleTxt)


    }


}