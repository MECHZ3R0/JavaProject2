package queueandstack;

import java.util.Stack;

public class CurlyBracesBalance {
    public static void main(String[] args) {
        String str = "{{}}";
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String str){
        Stack<Character> ch = new Stack<>();
        char c;
        int a=0,b=0;
        for (int i = 0; i < str.length(); i++) {
            ch.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            c=ch.pop();
            if(c=='{') a++;
            if(c=='}') b++;
        }
        return a==b?true:false;
    }
}
