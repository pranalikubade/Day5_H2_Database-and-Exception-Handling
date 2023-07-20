package com.bridgelabz.H2.Database.and.Validation.DTO;

public class ResponseDTO {
    public String message;
    public Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
