package com.example.lesson19

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson19.databinding.UserListItemBinding

class NotesViewHolder(private val userListItemBinding: UserListItemBinding):
RecyclerView.ViewHolder(userListItemBinding.root){



    fun bind (notes: Notes) {
        with(userListItemBinding) {
            userName.text = notes.name
            textMessage.text = notes.text
            textMessageData.text = notes.date

        }
    }

        companion object {
            fun from(parent: ViewGroup): NotesViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = UserListItemBinding.inflate(layoutInflater, parent, false)
                return NotesViewHolder(binding)
            }
        }

    }