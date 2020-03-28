package interfaces;

public class Cat implements Animal, AnimalID {
    public void makeSound(){
        System.out.println("Meow");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
    public void printYourId(){
        System.out.println("Cat");
    }
}
