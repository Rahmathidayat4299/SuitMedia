package com.dicoding.jetpackcompose.suitmedia

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.jetpackcompose.suitmedia.databinding.ItemUserBinding


/**
 * Created by Rahmat Hidayat on 15/01/2023.
 */
class Adapter(val context: Context, val dataset: List<Data>) : RecyclerView.Adapter<Adapter.ItemViewHolder>() {
// param


    class ItemViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
            val image = binding.imageUser
            val name = binding.username
            val email = binding.email
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        Glide.with(context)
                .load(item.avatar)
                .apply(RequestOptions.circleCropTransform())
                .into(holder.image)
        holder.name.text = item.firstName
        holder.email.text = item.email
    }

    override fun getItemCount() = dataset.size
}