package com.example.chapter4_topic2.databindingsimmple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapter4_topic2.R
import com.example.chapter4_topic2.databinding.ActivityMainBinding
import com.example.chapter4_topic2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

//        binding.txtFirst.text = "Zain"
//        binding.txtLast.text = "Zaidan Ahsan"
        binding.userdata = User("Zain", "Zaidan")

    }
}