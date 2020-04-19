package hashmapping;

import java.util.HashMap;

public class StringToStringHashMap {
    public static void main(String[] args) {
        forcode();
        System.out.println();
        forcity();
    }
    public static void forcode(){
        HashMap<String,String> coding=new HashMap<>();
        coding.put("Java","medium");
        coding.put("SQL","entry");
        coding.put("Selenium","master");
        coding.put("Cucumber","expert");
        for (String i:coding.keySet()){
            System.out.println("Keys: "+i+"\t\t\tValues: "+coding.get(i));
        }
    }
    public static void forcity(){
        HashMap<String,Integer> coding=new HashMap<>();
        coding.put("Los Angeles",85);
        coding.put("Chicago",30);
        coding.put("Denver",55);
        coding.put("Orlando",90);
        for (String i:coding.keySet()){
            System.out.println("Keys: "+i+"\t\t\tValues: "+coding.get(i));
        }
        System.out.println();
        int sum=0;
        for (String i:coding.keySet()){
            sum+=coding.get(i);
        }
        System.out.println("Average Temperature is "+sum/coding.size());
    }
}
