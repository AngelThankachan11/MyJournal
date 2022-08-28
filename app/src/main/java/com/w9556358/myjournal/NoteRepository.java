package com.w9556358.myjournal;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(NoteEntity note){
        new InsertAsync(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(NoteEntity note){
        new UpdateAsync(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<NoteEntity>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(NoteEntity note){
        new DeleteAsync(mNoteDatabase.getNoteDao()).execute(note);
    }
}