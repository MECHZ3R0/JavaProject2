package queueandstack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CaesarCipher {
    public static void main(String[] args) {
        String str ="knowledge is power";
        System.out.println(encoder(str));
    }
    public static String encoder(String str){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> key = new LinkedList<>(Arrays.asList(3,1,7,4,2,5));
        int temp;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ') {
                temp = key.poll();
                sb.append((char) (str.charAt(i) + temp));
                key.add(temp);
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        str=sb.toString();
        return str;
    }
}
