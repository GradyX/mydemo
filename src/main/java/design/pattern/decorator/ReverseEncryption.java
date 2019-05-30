package design.pattern.decorator;

import java.util.Arrays;

public class ReverseEncryption extends Encryption {

    public void encrypt() {
        String content = this.getEncryption().getContent();
        char[] words = content.toCharArray();
        char temp;
        for(int i = 0, j = words.length-1; i < words.length/2; i++,j--) {
            temp = words[j];
            words[j] = words[i];
            words[i] = temp;
        }
        content = new String(words);
        this.setContent(content);
    }

}
