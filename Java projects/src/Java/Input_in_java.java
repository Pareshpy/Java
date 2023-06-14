package Java;
import java.util.*;
public class Input_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your name :");
//        String str = sc.next(); //.next method is used to read only one word, suppose if you enter "Paresh nath Nandi" it will take only "Paresh" word.
//        System.out.println("Hello MR " +str);
//
//        // so if you want to take a whole sentence than you have to use another method called .nextLine
        System.out.println("Enter your Full name :");
        String Fullname = sc.nextLine();
        System.out.println("Welcome MR "+Fullname);


    }
}
