package design.pattern.bridge;

public class OracleDBUtil extends DBUtil {

    public void getConnection() throws DBException {
        // TODO Auto-generated method stub
        System.out.println("GET a Oracle connection");
    }

    @Override
    public String getData() throws DBException {
        return "OracleDBUtil data";
    }

}
