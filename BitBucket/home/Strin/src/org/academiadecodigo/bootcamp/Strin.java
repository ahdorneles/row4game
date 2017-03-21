package org.academiadecodigo.bootcamp;

public class Strin{
    public static void main(String[] args) {

        missingChar("Robocop", 3);
        //ROBCOP
        //receive command line argument if available
        if(args.length>=2){
            missingChar(args[0], Integer.parseInt(args[1]));
        }
    }

    private static void missingChar(String str, int n) {
        String str1 = str.substring(0,n);
        String str2 = str.substring(n+1);
        String nstr = (str1 .concat(str2));
        System.out.println(nstr);

    }
}