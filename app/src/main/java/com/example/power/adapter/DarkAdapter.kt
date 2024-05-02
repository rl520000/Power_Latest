package com.example.power.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.power.R
import com.example.power.model.Event

class DarkAdapter(private val list:ArrayList<Event>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType%2){
            0->{
                val view=View.inflate(parent.context, R.layout.item_dark,null)
                ViewHolder1(view)
            }
            else->{
                val view=View.inflate(parent.context, R.layout.item_light,null)
                ViewHolder2(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
val event=list[position]
        when(holder){
            is ViewHolder1->{
                holder.title.text=(position+1).toString()
                holder.type.text=event.type
                holder.time.text=event.time
                holder.from.text=event.from
                holder.state.text=event.state
                holder.data.text= event.data.toString()
                holder.img.setImageResource(event.img)
            }
            is ViewHolder2->{
                holder.title.text=(position+1).toString()
                holder.type.text=event.type
                holder.time.text=event.time
                holder.from.text=event.from
                holder.state.text=event.state
                holder.data.text= event.data.toString()
                holder.img.setImageResource(event.img)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class ViewHolder1(view: View):RecyclerView.ViewHolder(view){
        val type:TextView=view.findViewById(R.id.tv_type_dark)
        val time:TextView=view.findViewById(R.id.tv_time_dark)
        val from:TextView=view.findViewById(R.id.tv_from_dark)
        val state:TextView=view.findViewById(R.id.tv_state_dark)
        val img:ImageView=view.findViewById(R.id.iv_img_dark)
        val data:TextView=view.findViewById(R.id.tv_data_dark)
        val title:TextView=view.findViewById(R.id.tv_title_dark)
    }
    inner class ViewHolder2(view: View):RecyclerView.ViewHolder(view){
        val type:TextView=view.findViewById(R.id.tv_type_dark)
        val time:TextView=view.findViewById(R.id.tv_time_dark)
        val from:TextView=view.findViewById(R.id.tv_from_dark)
        val state:TextView=view.findViewById(R.id.tv_state_dark)
        val img:ImageView=view.findViewById(R.id.iv_img_dark)
        val data:TextView=view.findViewById(R.id.tv_data_dark)
        val title:TextView=view.findViewById(R.id.tv_title_dark)
    }
    override fun getItemViewType(position: Int): Int {
        return position
    }
}