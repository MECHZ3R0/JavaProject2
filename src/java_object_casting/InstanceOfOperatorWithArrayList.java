package java_object_casting;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfOperatorWithArrayList {
    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
        if(pens instanceof List){
            System.out.println("pens variable belongs to List class");
        }
        if(pens instanceof ArrayList){
            System.out.println("pens variable belongs to ArrayList class");
        }
        pens.add(new Pen());
        pens.add(new Crayola());
        pens.forEach(elements ->{
            if(elements instanceof Crayola){
                ((Crayola)elements).paint();
            }
            else{
                elements.color();
            }
        });
    }
}
class Pen{
    void color(){
        System.out.println("green");
    }
}
class Crayola extends Pen{
    void paint(){
        System.out.println("painting");
    }
}
