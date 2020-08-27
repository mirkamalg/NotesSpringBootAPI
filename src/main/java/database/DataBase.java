package database;

import com.example.test.model.Note;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Note> notes = new ArrayList<>();


    public static void addNote(Note note) {
        notes.add(note);
    }
}
