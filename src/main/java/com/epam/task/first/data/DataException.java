package com.epam.task.first.data;

public class DataException extends Exception {

    public DataException(String message, Exception e){
        super(message, e);
    }

}
