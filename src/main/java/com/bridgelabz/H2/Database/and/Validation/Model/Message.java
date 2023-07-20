package com.bridgelabz.H2.Database.and.Validation.Model;

import com.bridgelabz.H2.Database.and.Validation.DTO.MessageDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity                 //Table Creation
@Table(name = "TableInfo")

public class Message {
    @Id
    @GeneratedValue      //generate unique value automatically
    private int id;
    private String title;
    private LocalDate startDate;
    private String description;
    private String author;
    private LocalDate endDate;

    public Message() {

    }

    public Message(MessageDTO messageDTO) {
        this.updateMessage(messageDTO);
    }

    public void updateMessage(MessageDTO messageDTO) {
        this.title = messageDTO.title;
        this.startDate = messageDTO.startDate;
        this.description = messageDTO.description;
        this.author = messageDTO.author;
        this.endDate = messageDTO.endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
