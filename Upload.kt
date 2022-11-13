package com.natiqhaciyef.youtubeclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natiqhaciyef.youtubeclone.data.Category
import com.natiqhaciyef.youtubeclone.databinding.RecyclerCategoriesBinding

class CategoriesAdapter(var mContext: Context, var list: List<Category>) : RecyclerView.Adapter<CategoriesAdapter.CategoryHolder>() {

    inner class CategoryHolder(var binding: RecyclerCategoriesBinding): RecyclerView.ViewHolder(binding.root)



    override fun getItemCount(): Int {
        return list.size
    }
}
