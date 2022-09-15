package com.example.chapter4_topic2.tugas_latihandb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chapter4_topic2.R
import com.example.chapter4_topic2.databinding.FragmentBeritaBinding
import com.example.chapter4_topic2.databinding.FragmentDetailBeritaBinding


class DetailBeritaFragment : Fragment() {
    lateinit var binding : FragmentDetailBeritaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBeritaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getBerita = arguments?.getSerializable("dataBerita") as Berita
        binding.gambarBerita.setImageResource(getBerita.img)
        binding.title.text = getBerita.judul
        binding.penulisBerita.text = getBerita.penulis
        binding.content.text = getBerita.content
        binding.tanggalNews.text = getBerita.tanggal
    }





}