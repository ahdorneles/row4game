package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 06/02/17.
 */
public class FileManager {
    private boolean logged = false;
    private File[] files;


    public FileManager(int numberOfFiles) {
        files = new File[numberOfFiles];
    }


    public void login() {
        logged = true;
    }

    public void logOut() {
        logged = false;
    }

    public void createFile(String name) throws NotEnoughSpaceException, NotEnoughPermissionsException {
        if (logged == false) {
            throw new NotEnoughPermissionsException("You didn't login");
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = new File(name);
                System.out.println(name);
                return;
            }

        }
        throw new NotEnoughSpaceException("Array not long enough");
    }

    public File getFile(String name) throws FileNotFoundException, NotEnoughPermissionsException {
       if (logged == false){
           throw new NotEnoughPermissionsException("You didn't login22");
       }
        for (int i = 0; i < files.length; i++) {

            if (files[i] != null && files[i].getName().equals(name)) {
                System.out.println("File found: " + files[i].getName());
                return files[i];
            }
        }
        throw new FileNotFoundException("Name not found");
    }
}
