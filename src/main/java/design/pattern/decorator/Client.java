package design.pattern.decorator;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Encryption password = new UnEncryption();
        password.setContent("abcde");
        password.encrypt();
        System.out.println(password.getContent());
        
        Encryption shiftEncryption = new ShiftEncryption();
        shiftEncryption.setEncryption(password);
        shiftEncryption.encrypt();
        System.out.println(shiftEncryption.getContent());
        
        Encryption reverseEncryption = new ReverseEncryption();
        reverseEncryption.setEncryption(shiftEncryption);
        reverseEncryption.encrypt();
        System.out.println(reverseEncryption.getContent());
        
        ShiftEncryption tstr = new ShiftEncryption();
        tstr.dencrypt("011223");
        System.out.println(tstr.getContent());
    }

}
