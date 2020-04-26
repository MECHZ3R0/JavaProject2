package hashmapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ComparingRepeatingNumbers {
    public static void main(String[] args) {
        String input = "123412345123456";
        String temp="";
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<input.length()-2;i++){
            for (int j=i;j<i+3;j++) {
                temp += input.charAt(j);
            }
            list.add(Integer.parseInt(temp));
            temp="";
        }
        for (int i=0;i<list.size();i++){
            if (hm.containsKey(list.get(i))){
                hm.put(list.get(i),hm.get(list.get(i))+1);
            }
            else {
                hm.put(list.get(i),1);
            }
        }
        for (Integer i:hm.keySet()){
            System.out.println(i+" - "+hm.get(i)+" time(s)");
        }
    }
}
