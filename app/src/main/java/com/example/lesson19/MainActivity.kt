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


            val recyclerView = binding.recyclerView1
            val notes = listOf(
                Notes("Алексей", "Привет всем", "18.03.2024"),
                Notes("Алексей", "Простите что пропал", "18.03.2024"),
                Notes("Алексей", "Очень много времени потерял", "18.03.2024"),
                Notes("Алексей", "Работы было много", "18.03.2024"),
                Notes("Алексей", "Сейчас все наверстаю", "18.03.2024")


            )
            val myAdapter = UserAdapter(notes)
            recyclerView.adapter = myAdapter
            recyclerView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        }
    }


