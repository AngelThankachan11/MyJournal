package com.w9556358.myjournal;

import android.os.AsyncTask;

public class UpdateAsync extends AsyncTask<NoteEntity, Void, Void> {

    private NoteDao xNoteDao;

    public UpdateAsync(NoteDao dao) {
        xNoteDao = dao;
    }

    @Override
    protected Void doInBackground(NoteEntity... notes) {
        xNoteDao.updateNotes(notes);
        return null;
    }
}