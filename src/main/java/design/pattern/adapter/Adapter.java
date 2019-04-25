package design.pattern.adapter;

public class Adapter implements Target {

    private Encryptor encryptor;
    
    public Adapter() {
        encryptor = new Encryptor();
    }
    
    public String encryption(String str) {
        return encryptor.encryption(str);
    }

}
