package com.example.chapter4_topic2.databindingrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4_topic2.R
import com.example.chapter4_topic2.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    lateinit var binding : ActivityStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_student)
        var daftarStudent = arrayListOf(
            Student("Zain", "1402020043", R.drawable.ic_baseline_person_24),
            Student("Zaidan", "1200303030",R.drawable.ic_baseline_person_24)
        )
        binding.rvStudent.adapter = StudentAdapter(daftarStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}