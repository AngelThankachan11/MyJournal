package com.w9556358.myjournal;

import android.os.AsyncTask;

public class UpdateAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsync(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }
}