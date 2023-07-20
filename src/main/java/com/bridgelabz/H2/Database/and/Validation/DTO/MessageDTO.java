package com.bridgelabz.H2.Database.and.Validation.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class MessageDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z]{2,}$",message = "Title pattern Mismatch")
    @NotEmpty(message = "Title can not be Empty")
    public String title;
    public LocalDate startDate;
    public String description;

    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z]{2,}$",message = "Author pattern Mismatch")
    public  String author;
    public LocalDate endDate;
}
