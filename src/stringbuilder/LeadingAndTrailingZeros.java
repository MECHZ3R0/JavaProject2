package stringbuilder;

public class LeadingAndTrailingZeros {
    public static void main(String[] args) {
        removeLeadingTrailing("00230.001");
    }
    public static void removeLeadingTrailing(String n){
        StringBuilder s=new StringBuilder();
        StringBuilder r=new StringBuilder();
        String result="";
        int k=0,t=0,y=0,z=0;
        while (k<n.length()&&n.charAt(k)=='0'){
            t=++k;
        }
        while(t<n.length()&&n.charAt(t)!='.'){
            s.append(n.charAt(t));
            y=++t;
        }
        result=""+s;
        if (y<n.length()) {
            r=s;
            r.append(n.charAt(y));
            y++;
        }
        while(y<n.length()&&n.charAt(y)=='0'){
            r.append(n.charAt(y));
            z=++y;
        }
        while(z<n.length()&&n.charAt(z)!='0'){
            r.append(n.charAt(z));
            z++;
            result=""+r;
        }
        System.out.println(result);
    }
}
