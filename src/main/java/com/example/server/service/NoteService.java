package com.example.server.service;

import com.example.server.model.Notes;
import com.example.server.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;

    public Notes save(Notes notes) {
        return repository.save(notes);
    }

    public List<Notes> getAllNotes() {
        List<Notes> notes = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(notes::add);
        return notes;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<Notes> getNoteById(int id){
        return repository.getNoteById(id);
    }
}
