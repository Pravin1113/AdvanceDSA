package backtacking;

public class FindSubset {

    public static void findSubset(String str, String ans, int i){
        System.out.println("++++++"+ans);
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //yes condition
        findSubset(str, ans+str.charAt(i),i+1);
        // no condition
        findSubset(str, ans,i+1);
    }

    public static void main(String[] args) {
        String str = "abc";

        findSubset(str, "" , 0);
    }
}
