package com.example.chapter4_topic2.databindingrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic2.databinding.ItemStudentBinding

class StudentAdapter(var listStudent : ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemStudentBinding) : RecyclerView.ViewHolder(binding.root){
        fun dataBinding(itemData : Student){
            binding.dataStudent = itemData
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.dataBinding(listStudent[position])
    }

    override fun getItemCount(): Int {
         return listStudent.size
    }

}