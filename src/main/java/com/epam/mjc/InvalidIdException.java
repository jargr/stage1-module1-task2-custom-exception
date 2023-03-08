package com.epam.mjc;

public class InvalidIdException extends IllegalArgumentException{

    public InvalidIdException(Long id) {
        super("Could not find student with ID " + id);
    }
}
