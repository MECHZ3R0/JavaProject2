package questions;

import java.util.Arrays;

public class KaracasEncryptionAlgorithm {
    public static void main(String[] args) {
        String str="apple";
        encrypt(str);
    }
    public static void encrypt(String str){
        StringBuilder build = new StringBuilder();
        build.append(str);
        build.reverse();
        for(int i=0;i<build.length();i++){
            switch (build.charAt(i)){
                case 'a': build.replace(i,i+1,"0"); break;
                case 'e': build.replace(i,i+1,"1"); break;
                case 'o': build.replace(i,i+1,"2"); break;
                case 'u': build.replace(i,i+1,"3"); break;
            }
        }
        build.append("aca");
        System.out.println(build);
    }
}
