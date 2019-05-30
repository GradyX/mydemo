package design.pattern.decorator;

public class Encryption {
    
    private String content;
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private Encryption encryption;
    
    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }
    
    public Encryption getEncryption() {
        return this.encryption;
    }
    
    public void encrypt() {
    }
 
}
