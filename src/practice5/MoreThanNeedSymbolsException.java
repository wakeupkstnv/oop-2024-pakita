package practice5;

public class MoreThanNeedSymbolsException extends Exception{
    public MoreThanNeedSymbolsException() {
        super();
    }

    public MoreThanNeedSymbolsException(String message) {
        super(message);
    }

    public MoreThanNeedSymbolsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoreThanNeedSymbolsException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        if (super.getMessage() != null) return super.getMessage();
        return "More than need symbols";
    }
}
