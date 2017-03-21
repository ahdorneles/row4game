package org.academiadecodigo;

/**
 * Created by codecadet on 19/01/17.
 */
public class Front{
    public static void main(String[] args) {

        frontBack("heisenberg");

        //receive command line argument if available
        if(args.length>0){
            frontBack(args[0]);
        }
    }

    private static void frontBack(String str) {
        String str1 = str.substring(1, str.length()-1);
        char char1 = str.charAt(0);
        char char2 = str.charAt(str.length()-1);
        System.out.println(char1);
        System.out.println(str1);
        String nstr = (str1.concat(char1 + ""));
        String nstr2 = char2 + nstr;
        System.out.println(nstr2);
    }
}