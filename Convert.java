
/*
Given that strings are immutable, we cannot directly edit an instance to encrypt
it. Instead, our goal will be to generate a new string. A convenient technique for
performing string transformations is to create an equivalent array of characters, edit
the array, and then reassemble a (new) string based on the array.
Java has support for conversions from strings to character arrays and vice versa.
Given a string S, we can create a new character array matching S by using the
method, S.toCharArray( ). For example, if s="bird", the method returns the character
array A={'b', 'i', 'r', 'd'}. Conversely, there is a form of the String
constructor that accepts a character array as a parameter. For example, with character
array A={'b', 'i', 'r', 'd'}, the syntax new String(A) produces "bird".

Source : Data Structures and Algorithms in Java, 6th Edition
*/

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
