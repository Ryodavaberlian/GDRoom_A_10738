package com.example.gdroom_a_10738

import androidx.room.Insert

interface NoteDao {
    @Insert
    suspend fun addNote(note: Note)
    @Update
    suspend fun updateNote(note: Note)
    @Delete
    suspend fun deleteNote(note: Note)
    @Query("SELECT * FROM note")
    suspend fun getNotes() : List<Note>
    @Query("SELECT * FROM note WHERE id =:note_id")
    suspend fun getNote(note_id: Int) : List<Note>
}
