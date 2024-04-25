package fr.sdv.cnit.university.api.exception;

public class PlayerInvalidException extends RuntimeException {
    public PlayerInvalidException(String errorMessage) {
        super(errorMessage);
    }
}