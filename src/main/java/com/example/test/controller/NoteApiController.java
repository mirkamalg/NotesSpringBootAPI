package com.example.test.controller;

import com.example.test.model.Note;
import database.DataBase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteApiController {

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return DataBase.notes;
    }

    @PostMapping("/addnote")
    private Note addNote(@RequestBody Note note) {
        DataBase.addNote(note);
        return note;
    }
}
