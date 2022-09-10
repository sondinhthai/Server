package com.example.server.repository;

import com.example.server.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collections;
import java.util.List;

public interface NoteRepository extends CrudRepository<Notes, Integer> {
    @Query("SELECT n FROM Notes n WHERE n.uid=?1")
    public List<Notes> getNoteById(int id);
}
