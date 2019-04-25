package design.pattern.adapter;

public class Encryptor {

    public String encryption(String str) {
        char[] encryptorChars = str.toCharArray();
        for(int i = 0; i < encryptorChars.length; i++) {
            encryptorChars[i] = (char)(encryptorChars[i]+15);
        }
        return new String(encryptorChars, 0, encryptorChars.length);
    }
    
}
