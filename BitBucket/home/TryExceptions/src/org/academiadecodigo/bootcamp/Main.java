package org.academiadecodigo.bootcamp;


/**
 * Created by codecadet on 06/02/17.
 */
public class Main {
    public static void main(String[] args) {
       FileManager manager = new FileManager(2);
try{
    manager.login();
    manager.createFile("Fred");
    manager.createFile("Fre");
  //  manager.createFile("Alex");
    manager.getFile("Frse");
}
catch (NotEnoughPermissionsException e){
    System.out.println(e.getMessage());
}
catch (NotEnoughSpaceException f){
    System.out.println(f.getMessage());
}
catch (FileNotFoundException g){
    System.out.println(g.getMessage());
}

















    }


}
