package br.com.meiguins.desafiotodolist.entity.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
      super(message);
    }
  
  }