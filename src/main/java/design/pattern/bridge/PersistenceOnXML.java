package design.pattern.bridge;

public class PersistenceOnXML implements Persistence {

    @Override
    public void save(String content) {
        // TODO Auto-generated method stub
        System.out.println("XML:" + content);
    }

}
