package arraylist2d;

import java.util.Scanner;

public class PrintBigNumber {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number1=x.nextInt();
        System.out.print("Please enter a number: ");
        int number2=x.nextInt();
        System.out.print("Please enter a number: ");
        int number3=x.nextInt();
        if (number1>number2){
            if (number1>number3){
                System.out.println(number1);
            }
            else {
                System.out.println(number3);
            }
        }
        else{
            if (number2>number3){
                System.out.println(number2);
            }
            else{
                System.out.println(number3);
            }
        }
    }
}
