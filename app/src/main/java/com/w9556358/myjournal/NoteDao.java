package com.w9556358.myjournal;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import androidx.lifecycle.LiveData;

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
