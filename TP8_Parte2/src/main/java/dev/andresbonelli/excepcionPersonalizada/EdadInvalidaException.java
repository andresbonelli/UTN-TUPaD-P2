package dev.andresbonelli.excepcionPersonalizada;

public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String message) {
        super(message);
    }
}
