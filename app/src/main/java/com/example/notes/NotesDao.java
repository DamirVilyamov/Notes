package com.example.notes;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;



@Dao
public interface NotesDao {
    @Query("SELECT * FROM notes ORDER BY dayOfTheWeek")
    LiveData <List<Note>> getAllNotes();

    @Insert
    void insertNote(Note note);
    @Delete
void deleteNote(Note note);

    @Query("DELETE FROM notes")
    void deleteAllNotes();
}
