package design.pattern.bridge;

public class PersistenceOnTxt implements Persistence {

    @Override
    public void save(String content) {
        // TODO Auto-generated method stub
        System.out.println("Txt:" + content);
    }

}
