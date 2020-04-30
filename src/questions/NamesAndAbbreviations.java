package questions;

import java.util.ArrayList;

public class NamesAndAbbreviations {
    public static void main(String[] args) {
        filterStateNames("abb", "Arizona","CA","NY","Nevada");
        filterStateNames("full", "Arizona","CA","NY","Nevada");
    }
    public static void filterStateNames(String filter, String... names){
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        for(int i=0;i<names.length;i++){
            if(names[i].length()==2){
                arr1.add(names[i]);
            }
            else {
                arr2.add(names[i]);
            }
        }
        if (filter.equalsIgnoreCase("abb")){
            System.out.println(arr1);
        }
        else if (filter.equalsIgnoreCase("full")){
            System.out.println(arr2);
        }
    }
}
