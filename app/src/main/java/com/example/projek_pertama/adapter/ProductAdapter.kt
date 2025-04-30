package com.example.projek_pertama.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projek_pertama.R
import com.example.projek_pertama.model.Product

class ProductAdapter(private val products: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    class ProductViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val productTitle: TextView = view.findViewById(R.id.productTitle)
        private val productPrice: TextView = view.findViewById(R.id.productPrice)
        private val productImage: ImageView = view.findViewById(R.id.productImage)

        fun bind(product: Product) {
            productTitle.text = product.title
            productPrice.text = "$${product.price}"
            Glide.with(itemView.context).load((product.image)).into(productImage)
            Log.d("ProductAdapter", "Product: ${product}")

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int= products.size



}