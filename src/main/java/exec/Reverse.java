package exec;

public class Reverse {

    public int reverse(int x) {
        int reverse = 0;
        int pop = 0;
        while(x != 0) {
            pop = x % 10;
/*            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)){
                reverse = 0;
                break;
            }else if(reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)){
                reverse = 0;
                break;
            }*/
            reverse = (reverse) * 10 + (pop);
            x /= 10;
            System.out.println(x);
        }
        return reverse;
    }
    
    public static void main(String []args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(-123));
    }
    
}
