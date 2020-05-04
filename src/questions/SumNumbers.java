package questions;

public class SumNumbers {
    public static void main(String[] args) {
        sumNumbers("aa11b33");
    }
    public static void sumNumbers(String str){
        String temp="";
        int j=0,k=0;
        for (int i = 0; i < str.length();i++) {
            while(i<str.length()&&Character.isDigit(str.charAt(i))){
                while(i<str.length()&&Character.isDigit(str.charAt(i))){
                    temp+=str.charAt(i);
                    i++;
                }
                temp+=" ";
            }
        }
        String[] arr=temp.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            k+=Integer.parseInt(arr[i]);
        }
        System.out.println(k);
    }
}
