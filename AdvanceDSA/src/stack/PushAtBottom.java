package stack;

import java.util.Stack;

public class PushAtBottom {
    private static void pushAtBottom(Stack<Integer> s, int data) {

        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        System.out.println(top);
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(1);

        pushAtBottom(s,4);

        while (!s.empty()){
            System.out.println("===="+s.pop());
        }
    }


}
