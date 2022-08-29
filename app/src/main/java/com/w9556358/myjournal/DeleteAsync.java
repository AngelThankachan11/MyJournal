package com.w9556358.myjournal;

import android.os.AsyncTask;

public class DeleteAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao xNoteDao;

    public DeleteAsync(NoteDao dao) {
        xNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        xNoteDao.delete(notes);
        return null;
    }
}