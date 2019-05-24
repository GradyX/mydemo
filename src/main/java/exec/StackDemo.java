package exec;

import java.util.ArrayList;

public class StackDemo {

    public static boolean isValid(String s) {
        ArrayList<Character> chars = new ArrayList<Character>();
        int length = s.length();
        boolean result = true;
        for(int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            if(charAt == '(' || charAt == '{' || charAt == '[') {
                chars.add(charAt);
            }
            else {
                if(chars.size() > 0 && (charAt == (chars.get(chars.size()-1)+1) || charAt == (chars.get(chars.size()-1)+2))) {
                    chars.remove(chars.size()-1);
                    continue;
                }
                else {
                    result = false;
                    break;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("}"));
    }

}
