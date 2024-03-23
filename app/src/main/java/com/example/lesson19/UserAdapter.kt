package com.example.lesson19

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class UserAdapter(private val notes: List<Notes>):
    RecyclerView.Adapter<NotesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
       return NotesViewHolder.from(parent)

    }


    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        val notes = notes[position]
        holder.bind(notes)

        }


    override fun getItemCount(): Int {
        return notes.size
    }
}