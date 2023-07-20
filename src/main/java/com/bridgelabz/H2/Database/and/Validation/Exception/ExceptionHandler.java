package com.bridgelabz.H2.Database.and.Validation.Exception;

import com.bridgelabz.H2.Database.and.Validation.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandler {
   @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
      public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errMsg = errorList.stream().map(objError -> objError.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception while performing REST API", errMsg);
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
      }

      @org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
        public ResponseEntity<ResponseDTO> handleCustomException(CustomException exception){
          ResponseDTO responseDTO = new ResponseDTO("Exception while performing REST API", exception.getMessage());
          return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
      }
}
