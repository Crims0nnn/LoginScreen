package com.example.signupscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListItemAdapter(var context: Context, var list: ArrayList<UserModel>):
    RecyclerView.Adapter<ListItemAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView
        val textView2: TextView
        val image : ImageView

        init {
            textView = view.findViewById(R.id.Prenom )
            textView2 = view.findViewById(R.id.Nom)
            image = view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = list[position].firstname
        holder.textView2.text = list[position].lastname
       // holder.image.setImageResource()= list[position].image

    }



    override fun getItemCount()= list.size


}