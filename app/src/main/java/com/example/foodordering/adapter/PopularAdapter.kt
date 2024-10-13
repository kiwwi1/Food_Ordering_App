package com.example.foodordering.adapter

import android.media.Image
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodordering.databinding.PopulerItemBinding

class PopularAdapter(private val items:List<String>, private val price :List<String>, private val image: List<Int>): RecyclerView.Adapter<PopularAdapter.PouplerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PouplerViewHolder {
        return PouplerViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: PouplerViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class PouplerViewHolder(private val binding : PopulerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String, price: String, images: Int) {
            val imagesView = binding.imageView7
            binding.foodnamepopular.text = item
            binding.pricepopular.text = price
            imagesView.setImageResource(images)

        }

    }
}