package org.example.exceptions;

public class NotEnoughTicketsException extends Exception {
    public NotEnoughTicketsException() {}
    public NotEnoughTicketsException(String message) {
    }
    public NotEnoughTicketsException(String message, Throwable cause) {}
}
