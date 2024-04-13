package backtacking;

public class FindPermutation {

    private static void findPermutation(String str, String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            findPermutation(newStr, curChar+ans);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "" );
    }
}
