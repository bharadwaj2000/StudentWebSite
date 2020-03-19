package com.students.infobackend.models;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Table(name = "messages")
@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String message;
    public DateFormat uploaded = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DateFormat getUploaded() {
        return uploaded;
    }

    public void setUploaded(DateFormat uploaded) {
        this.uploaded = uploaded;
    }
}
