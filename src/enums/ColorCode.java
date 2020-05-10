package enums;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorCode {
    enum Colors{
        MAROON(155,200,180),
        TEAL(10,230,50);
        private int red;
        private int green;
        private int blue;
        Colors(int red, int green, int blue){
            this.red =red;
            this.green =green;
            this.blue =blue;
        }
        public int red(){
            return this.red;
        }
        public int green(){
            return this.green;
        }
        public int blue(){
            return this.blue;
        }
        public int[] allColors(){
            int[] allColors = new int[3];
            allColors[0]=this.red;
            allColors[1]=this.green;
            allColors[2]=this.blue;
            return allColors;
        }
    }

    public static void main(String[] args) {
        Colors color1 = Colors.MAROON;
        System.out.println(color1+" is "+color1.red()+", "+color1.green()+", "+color1.blue());
        System.out.println(Arrays.toString(color1.allColors()));

        Colors color2 = Colors.TEAL;
        System.out.println(color2+" is "+color2.red()+", "+color2.green()+", "+color2.blue());
        System.out.println(Arrays.toString(color2.allColors()));

        ArrayList<Integer> c1=new ArrayList<>();
        c1.add(color1.red());
        c1.add(color1.green());
        c1.add(color1.blue());

        ArrayList<Integer> c2=new ArrayList<>();
        c2.add(color2.red());
        c2.add(color2.green());
        c2.add(color2.blue());

        System.out.println(c1);
        System.out.println(c2);
    }
}
