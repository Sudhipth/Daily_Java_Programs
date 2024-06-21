package Daily_Problem;

import java.util.ArrayList;

public class Day2_ArrayList_SubSequence {
    static ArrayList<String> s = new ArrayList<>();
    public static void printSub(String str , String ans) {
        if(str.length() == 0){
            s.add(ans);
            return;
        }
        char ch = str.charAt(0);
        printSub(str.substring(1),ans + ch);
        printSub(str.substring(1),ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSub(str , "");
        System.out.println(s);
    }
}