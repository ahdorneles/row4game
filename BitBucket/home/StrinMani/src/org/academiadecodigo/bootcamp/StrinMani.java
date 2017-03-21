package org.academiadecodigo.bootcamp;

class StrinMani{
    public static void main(String[] arg){
        String str = "http://www.academiadecodigo.org";

        String domain = ""; // www.academiadecodigo.org
        String name = "";   // < Academia de Codigo_ >
        String cadet = "I am a Code Cadet at ";
        String str1 = str.replaceAll("[http:]+..", " ");
        //System.out.println(str1);//GOOD
        String str2 = str.replaceAll("[^(a-z)]"," ") ;
        String str3 = str2.replaceAll("^\\w+\\s+\\w{3}","  ");
        String str4 = str3.replaceAll("(.{3})$","  ");
        String str5 = str4.replaceAll("(^  )","< ");
        String str6 = str5.replaceAll("(   )$","_ >, ");
        String str7 = str6.replaceFirst("a", "A");
        String str8 = str7.substring(0,11);
        String str9 = str7.substring(11,13);
        String str10 = str7.substring(13);
        String str11 = str10.replaceFirst("c", "C");
        String str12 = str11.replaceFirst("o", "ó");
        String str13 = str8 + " " + str9 + " "+ str12;
    System.out.println(cadet + str13 + str1 );
/*
  System.out.println(str7);
  System.out.println(str8);
  System.out.println(str9);
  System.out.println(str11);
*/
// print the following message at the end
// I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org
    }

}