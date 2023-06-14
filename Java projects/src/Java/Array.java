package Java;

public class Array {
    public static void main(String[] args) {
//        Arrays in Java

        int[] marks ; // declaration of an array
        marks = new int [5]; //memory allocation

        int[] marks2 = new int[5]; //declaration + memory allocation

        int[] marks3 = {10, 20, 30, 40, 50}; //declaration and initialize [note: we don't have to initialize memory allocation since we initialize the array with values java automatically initialize the memory allocation  ]

        int size = marks3.length;
        System.out.println(size);
        int i;
        for(i=0;i<=size-1;i++){
            System.out.println(marks3[i]);

        }
    }
}
