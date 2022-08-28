package com.w9556358.myjournal;

import android.os.AsyncTask;

public class DeleteAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsync(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        mNoteDao.delete(notes);
        return null;
    }
}
