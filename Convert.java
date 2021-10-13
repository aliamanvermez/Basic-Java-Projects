import java.util.*;

public class Convert {


    public static void main(String[] args) {
        String str = "Basic-Java-Projects";


        char [] ch = new char[str.length()];


        for (int i =0;  i < str.length(); i++){
            ch[i]= str.charAt(i);
        }

        for (char c : ch){
            System.out.println(c);
        }

        /*
        Output should be :

        B
        a
        s
        i
        c
        -
        J
        a
        v
        a
        -
        P
        r
        o
        j
        e
        c
        t
        s


         */


    }








}
