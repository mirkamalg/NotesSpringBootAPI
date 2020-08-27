package com.example.test.model;

public class Note {

    private final String id, header, body;

    public Note(String id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }
}
