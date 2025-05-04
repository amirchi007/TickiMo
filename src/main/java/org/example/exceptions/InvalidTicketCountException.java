package org.example.exceptions;

public class InvalidTicketCountException extends Exception {
    public InvalidTicketCountException(){}
    public InvalidTicketCountException(String message) {}
    public InvalidTicketCountException(String message, Throwable cause) {}
}