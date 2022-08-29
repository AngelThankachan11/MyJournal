package com.w9556358.myjournal;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    long[] insertNotes(NoteEntity[] notes);

    @Query("SELECT * FROM notes")
    LiveData<List<NoteEntity>> getNotes();

    @Delete
    int delete(NoteEntity... notes);

    @Update
    int updateNotes(NoteEntity... notes);
}
