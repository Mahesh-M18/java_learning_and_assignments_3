package customexceptions;

public class InvalidContactException extends RuntimeException {

    public InvalidContactException(String message) {

        super(message);
    }
}
