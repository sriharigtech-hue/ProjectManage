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

class OngoingAdapter(private val items: List<OngoingDomain>) :
    RecyclerView.Adapter<OngoingAdapter.Viewholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return Viewholder(view)



    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {


        // Set item data

        val item = items[position]
        holder.title.text = item.title
        holder.date.text = item.date
        holder.progressBarPercent.text = "${item.progressPercentage}%"
        val drawableResourceId = holder.itemView.context.resources.getIdentifier(
            item.picPath,
            "drawable",
            holder.itemView.context.packageName
        )
        Glide.with(holder.itemView.context).load(drawableResourceId).into(holder.pic)
        holder.progressBar.progress = item.progressPercentage


        // Set background color based on item position

        with(holder) {
            if (position == 0) {
                layout.setBackgroundResource(R.drawable.dark_bg)
                setTextColor(R.color.white)
            } else {
                layout.setBackgroundResource(R.drawable.light_purple_bg)
                setTextColor(R.color.darkPurple)


            }
        }


    }

    override fun getItemCount(): Int = items.size

    // ViewHolder class

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Declare views from the layout

        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val date: TextView = itemView.findViewById(R.id.dateTxt)
        val progressTxt: TextView = itemView.findViewById(R.id.progressTxt)
        val progressBarPercent: TextView = itemView.findViewById(R.id.percentTxt)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val pic: ImageView = itemView.findViewById(R.id.pic)
        val layout: ConstraintLayout = itemView.findViewById(R.id.layout)

        // Set text color based on item position

        fun setTextColor(colorRes: Int) {
            title.setTextColor(itemView.context.getColor(colorRes))
            date.setTextColor(itemView.context.getColor(colorRes))
            progressTxt.setTextColor(itemView.context.getColor(colorRes))
            progressBarPercent.setTextColor(itemView.context.getColor(colorRes))
            pic.setColorFilter(
                ContextCompat.getColor(itemView.context, colorRes),
                PorterDuff.Mode.SRC_IN
            )
            progressBar.progressTintList =
                ColorStateList.valueOf(ContextCompat.getColor(itemView.context, colorRes))


        }


    }


}