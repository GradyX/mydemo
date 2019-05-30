package design.pattern.decorator;

import java.util.Arrays;

public class ShiftEncryption extends Encryption {

    public void encrypt() {
        String content = this.getEncryption().getContent();
        char[] words = content.toCharArray();
        for(int i = 0; i < words.length; i++) {
            words[i] >>= 1;
        }
        content = new String(words);
        this.setContent(content);
    }
    
    public void dencrypt(String content) {
        char[] words = content.toCharArray();
        for(int i = 0; i < words.length; i++) {
            words[i] <<= 1;
        }
        content = new String(words);
        this.setContent(content);
    }

}
