package br.com.robson.api_spring_mongodb.services.exceptions;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String mensagem){
        super(mensagem);
    }
}
