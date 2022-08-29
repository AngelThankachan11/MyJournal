package com.w9556358.myjournal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notes")
public class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "Heading")
    public String head;

    @ColumnInfo(name = "Content")
    public String content;
}