package Java;

//import java.io.PrintStream;

public class Strings {
    public static void main(String[] args) {
        //string name = new String("Paresh");
        //String name = "Paresh";
        //Strings are immutable it cant be changed


        //System.out.println("Hello " + name);

        // also printf (c program Print) its also print like c programming .
        int a =60;
        float b = 2.23f;
        char c = 'P';
        String str = "PARESH";

        System.out.printf("So the int is %d ,float is %.2f ,char is %c and The String is %s",a,b,c,str);
        System.out.println();
        // printf = format [ format works same as the printf ]



        // length() method is used to calculate the length of the string
        int length = str.length();
        System.out.println("The length of " + str + " is " + length);



        // toLowerCase() method is used to convert the upper case to the lower case of any string and character
        String lstring = str.toLowerCase();
        System.out.println("The "+str+" Which is in upper case converted into lowercase and it would be "+lstring);



        // toUpperCase() method is used to convert any lower case string or character into upper case string or character
        String upstring = lstring.toUpperCase();
        System.out.println("The "+lstring+" Which is in lower case converted into uppercase and it would be "+upstring);



        // trim() method is used to trim the extra Space in the font of the char and back of the char [note: not between in the char]
        String  nontrimmedstring ="    PARESH    ";
        System.out.println("This is the non Trimmed String "+nontrimmedstring+ " And its takes " +nontrimmedstring.length()+" length of char");
        System.out.println("This is the Trimmed String "+nontrimmedstring.trim()+ " And its takes " +nontrimmedstring.trim().length()+" length of char");


        // substring() method is return a new string and whatever the int value is provided in that no of char to the last char of the string it would be returned
        System.out.println(str.substring(2));
        // this method is another usage .substring( beginIndex:2,endIndex:3);
        System.out.println(str.substring(0, 4));



        //replace() method is used to replace the specific given char/string to the other given new char/string
        System.out.println(str.replace('P','N'));
        System.out.println(str.replace("P","Bhab"));


        //startsWith() method returns true if string starts with string "PAR" true in this case [note: this is case-sensitive]
        System.out.println(str.startsWith("PAR")); //true case
        System.out.println(str.startsWith("par")); //false case

        //endsWith() method return true id the string ends with string "SH" true in this case [note : this is also case-sensitive]
        System.out.println(str.endsWith("SH")); //true case
        System.out.println(str.endsWith("rh")); //false case


        //charAt() method returns which char is placed in the given index value
        System.out.println(str.charAt(2));
        //System.out.println(str.charAt(9)); // error Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 9 out of bounds for length 6
        String name = "BOSS";
        //indexOf() method returns the index no of the given char/string
        System.out.println(str.indexOf("R")); //PARESH so R is in 2 no of index
        System.out.println(str.indexOf("J")); //Not Present in the String, so it returns negative value in this case it returns -1
        System.out.println(name.indexOf("S")); //boss has 2-S in itself so it return 1st index no of the founded char in this case it returns 2




    }

}
