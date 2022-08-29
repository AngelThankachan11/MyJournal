package com.w9556358.myjournal;


import android.os.AsyncTask;

public class InsertAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao xNoteDao;

    public InsertAsync(NoteDao dao) {
        xNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        xNoteDao.insertNotes(notes);
        return null;
    }
}