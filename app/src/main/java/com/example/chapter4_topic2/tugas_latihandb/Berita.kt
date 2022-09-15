package com.example.chapter4_topic2.tugas_latihandb

import java.io.Serializable

data class Berita (var judul : String , var penulis : String, var img : Int, var tanggal : String, var content : String) : Serializable