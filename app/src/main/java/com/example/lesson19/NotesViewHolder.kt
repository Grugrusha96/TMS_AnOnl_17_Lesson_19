package com.example.lesson19

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesViewHolder(root: View): RecyclerView.ViewHolder(root) {

    val nameTextView: TextView = root.findViewById(R.id.userName)
    val dataTextView: TextView = root.findViewById(R.id.textMessageData)
    val textTextView: TextView = root.findViewById(R.id.textMessage)

}