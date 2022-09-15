package com.example.chapter4_topic2.tugas_latihandb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic2.R
import com.example.chapter4_topic2.databinding.ItemBeritaBinding
import com.example.chapter4_topic2.databinding.ItemStudentBinding
import com.example.chapter4_topic2.databindingrecycleview.StudentAdapter


class BeritaAdapter(var listBerita : ArrayList<Berita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){
        fun dataBinding(itemData : Berita){
            binding.dataBerita = itemData
            binding.cardViewBerita.setOnClickListener(){
                var bund = Bundle()
                bund.putSerializable("dataBerita", itemData)
                Navigation.findNavController(itemView).navigate(R.id.action_fragmentBerita_to_detailBeritaFragment, bund)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BeritaAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBinding(listBerita[position])
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}