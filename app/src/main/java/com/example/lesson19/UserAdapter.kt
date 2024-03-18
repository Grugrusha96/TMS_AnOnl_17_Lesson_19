package com.example.lesson19

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class UserAdapter(private val notes: List<Notes>):
    RecyclerView.Adapter<NotesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val notesView = layoutInflater.inflate(R.layout.user_list_item, parent,false)
        val notesViewHolder = NotesViewHolder(notesView)
        return notesViewHolder
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        val notes = notes[position]
        holder.nameTextView.text = notes.name
        holder.textTextView.text = notes.text
        holder.dataTextView.text = notes.date

    }

    override fun getItemCount(): Int {
        return notes.size
    }
}