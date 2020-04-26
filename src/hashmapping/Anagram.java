package hashmapping;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String[] arr={"cat","cta","car","care"};
        HashMap<Integer,HashMap<Character,Integer>> hm = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            hm.put(i, new HashMap<>());
            for (int j=0;j<arr[i].length();j++){
                if (hm.get(i).containsKey(arr[i].charAt(j))) {
                    hm.get(i).put(arr[i].charAt(j),hm.get(i).get(arr[i].charAt(j))+1);
                }
                else{
                    hm.get(i).put(arr[i].charAt(j),1);
                }
            }

        }
        for (int i=0;i<hm.size()-1;i++){
            if (hm.get(i).size()!=hm.get(i+1).size()){
                System.out.println(arr[i]+" and "+arr[i+1]+" are NOT anagram");
            }
            else {
                if (hm.get(i).equals(hm.get(i+1))){      //this code is essential for solution
                    System.out.println(arr[i]+" and "+arr[i+1]+" are anagram");
                }
                else{
                    System.out.println(arr[i]+" and "+arr[i+1]+" are NOT anagram");
                }
            }
        }
    }
}
