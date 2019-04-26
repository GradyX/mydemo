package design.pattern.bridge;

public class PersistenceOnPdf implements Persistence {

    @Override
    public void save(String content) {
        // TODO Auto-generated method stub
        System.out.println("Pdf:" + content);
    }

}
