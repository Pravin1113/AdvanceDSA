package stack;

import java.util.Stack;

public class ReverseString {

    private static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx= 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
    StringBuilder newString = new StringBuilder("");
        while (!s.empty()){
            newString.append(s.pop());
        }
        return newString.toString();

    }
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }


}
