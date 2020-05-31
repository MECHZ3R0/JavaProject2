package questions;

import java.util.ArrayList;
//IPv4 Validation
//https://edabit.com/challenge/kHLmnk3RhekGKe7fP
public class IPv4Validation {
    public static void main(String[] args) {
        System.out.println(isValidIP("1.2.3.4"));
        System.out.println(isValidIP("1.2.3"));
        System.out.println(isValidIP("1.2.3.4.5"));
        System.out.println(isValidIP("123.45.67.89"));
        System.out.println(isValidIP("123.456.78.90"));
        System.out.println(isValidIP("123.045.067.089"));
    }
    public static boolean isValidIP(String ip){
        boolean q =true;
        ArrayList<Boolean> booleans =new ArrayList<>();
        String[] ipSegments = ip.split("\\.");
        if(ipSegments.length==4){
            for (int i = 0; i < ipSegments.length; i++) {
                if(isValidNumber(ipSegments[i])){
                    if (ipSegments[i].charAt(0)!='0'&&ipSegments[i].charAt(ipSegments[i].length()-1)!='0') {
                        booleans.add(true);
                    }
                    else {
                        booleans.add(false);
                    }
                }
                else {
                    booleans.add(false);
                }
            }
        }
        else {
            booleans.add(false);
        }
        for (boolean x:booleans) {
            if(!x){
                q=false;
            }
        }
        return q;
    }
    public static boolean isValidNumber(String ipSegment){
        int number = Integer.parseInt(ipSegment);
        return number>0&&number<256;
    }
}
