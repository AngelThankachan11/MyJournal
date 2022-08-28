package com.w9556358.myjournal;


import android.os.AsyncTask;

public class InsertAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao mNoteDao;

    public InsertAsync(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}