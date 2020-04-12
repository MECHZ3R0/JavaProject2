package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CutInHalf {
    public static void main(String[] args) {
        ArrayList<Integer> intgr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(inthalf1(intgr));
        System.out.println(inthalf2(intgr));
        System.out.println(intCombine(inthalf1(intgr),inthalf2(intgr)));
        ArrayList<String> str=new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));
        System.out.println(strhalf1(str));
        System.out.println(strhalf2(str));
        System.out.println(strCombine(strhalf1(str),strhalf2(str)));
    }
    public static ArrayList<Integer> inthalf1(ArrayList<Integer> intgr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<intgr.size()/2;i++){
            temp.add(intgr.get(i));
        }
        return temp;
    }
    public static ArrayList<Integer> inthalf2(ArrayList<Integer> intgr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=intgr.size()/2;i<intgr.size();i++){
            temp.add(intgr.get(i));
        }
        return temp;
    }
    public static ArrayList<String> strhalf1(ArrayList<String> str){
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<str.size()/2;i++){
            temp.add(str.get(i));
        }
        return temp;
    }
    public static ArrayList<String> strhalf2(ArrayList<String> str){
        ArrayList<String> temp=new ArrayList<>();
        for(int i=str.size()/2;i<str.size();i++){
            temp.add(str.get(i));
        }
        return temp;
    }
    public static ArrayList<Integer> intCombine(ArrayList<Integer> int1, ArrayList<Integer> int2){
        for (int i=0;i<int2.size();i++){
            int1.add(int2.get(i));
        }
        return int1;
    }
    public static ArrayList<String> strCombine(ArrayList<String> str1, ArrayList<String> str2){
        for (int i=0;i<str2.size();i++){
            str1.add(str2.get(i));
        }
        return str1;
    }
}
