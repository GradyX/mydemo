package design.pattern.bridge;

public class Client {

    public static void main(String[] args) {
        DBUtil dbUtil = new MySQLDBUtil();
        Persistence persistence = new PersistenceOnTxt();
        dbUtil.setPersistence(persistence);
        try {
            dbUtil.dbDataToFile(dbUtil.getData());
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

}
