package exec;

public class Pow {
    
    public static double myPow(double x, int n) {
        double temp = 1;
        int flag = 1;
        if(n < 0) {
            flag = -1;
            n = -n;
        }
        while(n > 0) {
            temp *= x;
            n--;
        }
        if(flag == -1) {
            temp = 1/temp;
        }
        
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }

}
