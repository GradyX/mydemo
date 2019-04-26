package design.pattern.bridge;

public abstract class DBUtil {
    
    private Persistence persistence;
    
    public void setPersistence(Persistence persistence) {
        this.persistence = persistence;
    }

    public abstract void getConnection() throws DBException;
    
    public abstract String getData()  throws DBException;
    
    public void dbDataToFile(String data) {
        persistence.save(data);
    }
}
