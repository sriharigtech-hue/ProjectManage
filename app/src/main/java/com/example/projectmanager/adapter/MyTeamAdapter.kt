package com.example.projectmanager.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmanager.R
import com.example.projectmanager.domain.TeamDomain

class MyTeamAdapter(private val items: List<TeamDomain>) :
    RecyclerView.Adapter<MyTeamAdapter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_team, parent, false)
        return Viewholder(view)

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        // Set item data

        val item = items[position]
        holder.title.text = item.title
        holder.status.text = item.status


    }

    override fun getItemCount(): Int = items.size

    // ViewHolder class

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Declare views from the layout

        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val status: TextView = itemView.findViewById(R.id.statusTxt)


    }


}