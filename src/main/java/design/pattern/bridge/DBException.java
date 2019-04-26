package design.pattern.bridge;

public class DBException extends Exception {

    private static final long serialVersionUID = 8258778819834451549L;

    public DBException() {
        super("DB operator occur exception");
    }
    
}
