package exec;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        int x = 12321;
/*        int temp = 0;
        boolean r = true;
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        while(x != 0) {
            temp = x % 10;
            stack.add(temp);
            queue.add(temp);
            x /= 10;
        }
        
        while(!stack.isEmpty() && !queue.isEmpty()) {
            if(stack.pop() != queue.remove()) {
                r = false;
                break;
            }
        }*/
        boolean r = true;
        if(x < 0) {
            r = false;
        }
        int y = x;
        int z = x;
        int temp = 0;
        int left = 1;
        
        while(x != 0) {
            temp = x % 10;
            x /= 10;
            left *= 10;
        }
        
        left /= 10;
        
        System.out.println(y / left);
        
        while(z > 0) {
            if(y / left != z % 10) {
                r = false;
                break;
            }
            y -= ((y/left) * left);
            left /= 10;
            z /= 10;
        }
        
        System.out.println(r);

    }

}
