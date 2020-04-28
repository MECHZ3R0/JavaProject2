package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Winner {
    public static void main(String[] args) {
        String[] votes={"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
        HashMap<String,Integer> hm=new HashMap<>();
        for (String s:votes){
            if (hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s,1);
            }
        }

        //Method 1:
        int m=0;
        String win="";
        for(String s:hm.keySet()){
            if (hm.get(s)>m){
                m=hm.get(s);
                win=s;
            }
        }
        System.out.println(win);

        //Method 2:
        int m2=0;
        String win2="";
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapElement = (Map.Entry) itr.next();
            if ((int)mapElement.getValue()>m2){
                m2=(int)mapElement.getValue();
                win2=mapElement.getKey().toString();
            }
        }
        System.out.println(win2+" with "+m2+" scores");
    }
}
