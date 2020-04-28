package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListQuestion {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String sizeRead=x.nextLine();
        int size=Integer.parseInt(sizeRead);
        String numbersRead=x.nextLine();
        String[] numbers = numbersRead.split(" ");
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<size;i++){
            arr.add(Integer.parseInt(numbers[i]));
        }
        String numberOfQueriesRead = x.nextLine();
        int numberOfQueries = Integer.parseInt(numberOfQueriesRead);
        for (int i=0;i<numberOfQueries;i++){
            String query=x.nextLine();
            if (query.equalsIgnoreCase("Insert")){
                String insertNumbersRead=x.nextLine();
                String[] insertNumbers = insertNumbersRead.split(" ");
                int indexAdd = Integer.parseInt(insertNumbers[0]);
                int valueAdd = Integer.parseInt(insertNumbers[1]);
                arr.add(indexAdd,valueAdd);
            }
            else if (query.equalsIgnoreCase("Delete")){
                String deleteIndexRead=x.nextLine();
                int deleteIndex = Integer.parseInt(deleteIndexRead);
                arr.remove(deleteIndex);
            }
        }
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
