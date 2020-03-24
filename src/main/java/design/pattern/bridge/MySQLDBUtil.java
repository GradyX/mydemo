package design.pattern.bridge;

public class MySQLDBUtil extends DBUtil {

    public void getConnection() throws DBException {
        // TODO Auto-generated method stub
        System.out.println("GET a MySQL connection");
    }

    @Override
    public String getData() throws DBException {
        return "MySQLDBUtil data";
    }
    
}