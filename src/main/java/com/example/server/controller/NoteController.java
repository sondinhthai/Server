package com.example.server.controller;

import com.example.server.model.Notes;
import com.example.server.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/note/get-all")
    public List<Notes> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping("/note/save")
    public Notes save(@RequestBody Notes notes) {
        return noteService.save(notes);
    }

    @RequestMapping(value = "/note/get-by-id/{id}", method = RequestMethod.GET)
    public List<Notes> getNoteById(@PathVariable("id") int id){
        return noteService.getNoteById(id);
    }

    @RequestMapping(value = "/note/delete/{id}", method = RequestMethod.POST)
    public void deleteNote(@PathVariable("id") int id){
        noteService.delete(id);
    }
}
