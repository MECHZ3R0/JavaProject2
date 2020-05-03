package stringbuilder;

import java.util.Hashtable;

public class ToOrdinalNumbers {
    public static void main(String[] args) {
        toOrdinalNumbers("12");
    }
    public static void toOrdinalNumbers(String number){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(0,"th ");
        ht.put(1,"st ");
        ht.put(2,"nd ");
        ht.put(3,"rd ");
        for (int i=4;i<10;i++){
            ht.put(i,"th ");
        }
        for (int i:ht.keySet()) {
            if (Integer.parseInt(number)>=11&&Integer.parseInt(number)<=13){
                System.out.println(number+"th");
                break;
            }
            else {
                if (Integer.parseInt(""+number.charAt(number.length()-1))==i){
                    System.out.println(number+ht.get(i));;
                }
            }
        }
    }
}
