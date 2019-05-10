package datastructure;

public class OperateString {

    public int Index(String mainStr, String subString, int pos) {
        char[] mainChars = mainStr.toCharArray();
        char[] subChars = subString.toCharArray();
        for(int i = 0; i < mainChars.length; i++) {
            for(int j = 0; j < subChars.length; j++) {
                if(mainChars[i+j] == subChars[j]) {
                    continue;
                }
                else {
                    break;
                }
            }
        }
        return 0;
    }
    
}
