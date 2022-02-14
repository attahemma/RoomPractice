package com.itech.roompractice;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")  //this annotation creates a table in the sqlite db
public class Word {

    /*
    * as best practice keep your fields
    * private and make getters for the
    * fields public
     */
    @PrimaryKey  //this annotation makes this field a primary key
    @NonNull //this annotation means that this field cannot be null
    @ColumnInfo(name = "word") //this annotation defines the name of the column in the table
    private String mWord;

    public Word(@NonNull String word){
        this.mWord = word;
    }
    public String getWord(){
        return this.mWord;
    }
}
