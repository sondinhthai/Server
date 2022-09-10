package com.example.server.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "note")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String content;
    private int uid;
}
