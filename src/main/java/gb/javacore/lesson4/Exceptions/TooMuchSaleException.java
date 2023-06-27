package gb.javacore.lesson4.Exceptions;


public class TooMuchSaleException extends RuntimeException{
    public TooMuchSaleException(String message) {
        super(message);
    }
}
