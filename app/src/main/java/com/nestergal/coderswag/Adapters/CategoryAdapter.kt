package com.nestergal.coderswag.Adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nestergal.coderswag.Model.Category
import com.nestergal.coderswag.R

/**
 * Created by neste on 1/4/2018.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        val holder : ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
          holder.categotyImage = categoryView.findViewById(R.id.categoryImage)
           holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val categoty = categories[position]

        val resourceId = context.resources.getIdentifier(categoty.image, "drawable", context.packageName)
        holder.categotyImage?.setImageResource(resourceId)


        holder.categoryName?.text = categoty.title
          return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories [position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categotyImage: ImageView? = null
        var categoryName: TextView? = null
    }
}