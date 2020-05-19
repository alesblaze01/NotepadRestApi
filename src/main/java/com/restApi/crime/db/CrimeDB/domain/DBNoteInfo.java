package com.restApi.crime.db.CrimeDB.domain;
import javax.persistence.*;


@Entity
@Table(name = "notes")
public class DBNoteInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    public long id;
    @Column(name = "course_title")
    public String courseTitle;
    @Column(name = "user_email")
    public String userEmail;
    @Column(name = "note_title")
    public String  noteTitle;
    @Column(name = "note_text")
    public String noteText;
}

