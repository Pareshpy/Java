package Java;

import java.util.Scanner;

public class Input_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[25];
        int i;
        System.out.println("Enter how manny num do you want:\t");
        int size = sc.nextInt();
        for(i=0;i<=size-1;i++){
            System.out.println("Enter the value for arr["+i+"] :\t");
            arr[i] = sc.nextInt();
        }
        for(i=0;i<=size-1;i++){
            System.out.println("arr["+i+"] :\t"+arr[i]);
    }
}

}
