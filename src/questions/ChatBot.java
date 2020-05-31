package questions;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        FileWriter write = new FileWriter("chatbot conversations.txt");
        String str1="", str2;
        do {
            System.out.print("Write something: ");
            str1=scan.nextLine();
            System.out.println(str1);
            write.write(str1+"\n");
            if(!str1.equals("q")) {
                str2 = randomString();
                System.out.println(str2);
                write.write(str2 + "\n");
            }
        }
        while(!str1.equals("q"));
        write.close();
    }
    public static String randomString(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello?");
        strings.add("How are you?");
        strings.add("Are you happy?");
        strings.add("How is the weather?");
        strings.add("Where are you?");
        return strings.get((int)(Math.random()*5));
    }
}
