public class OpenCloseCheckException extends Exception{

    public OpenCloseCheckException(String message) {
        super(message);
        System.out.println("Device is already open");
    }
}
