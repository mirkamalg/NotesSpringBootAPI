package com.example.test;

import com.example.test.model.Note;
import database.DataBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);

		DataBase.notes.add(new Note(UUID.randomUUID().toString(), "header 1", "body 1"));
		DataBase.notes.add(new Note(UUID.randomUUID().toString(), "header 2", "body 2"));
	}

}
