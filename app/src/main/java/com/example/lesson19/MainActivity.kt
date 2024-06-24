package com.example.lesson19


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson19.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)



       if (this::binding.isInitialized) {
            val recyclerView = binding.recyclerView1
            val notes = listOf(
                Notes("Алексей", "Привет всем", "18.03.2024"),
                Notes("Алексей", "Я тут новенький", "18.03.2024"),
                Notes("Алексей", "надеюсь все получится", "18.03.2024"),
                Notes("Алексей", "Рад с вами познакомиться", "18.03.2024"),
                Notes("Алексей", "всем удачи", "18.03.2024")


            )
            val myAdapter = UserAdapter(notes)
            if (recyclerView != null) {
                recyclerView.adapter = myAdapter
            }
            if (recyclerView != null) {
                recyclerView.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            }
        }
    }
}


