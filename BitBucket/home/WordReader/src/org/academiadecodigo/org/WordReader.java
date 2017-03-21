package org.academiadecodigo.org;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by codecadet on 13/02/17.
 */
public class WordReader implements Iterable<String> {
    private FileReader fileReader;
    private BufferedReader reader;
    private ArrayList<String> arrayList;
    private String result;
    private String line;
    private String[] words;
    private String file;

    public WordReader(String file) throws IOException {
        this.file = file;

    }


/*          this.fileReader = new FileReader(file);
        this.reader = new BufferedReader(fileReader);
        this.arrayList = new ArrayList<>();
        line = "";
        result = "";
        while ((line = reader.readLine()) != null) {
            result += line + "\n";
            this.words = result.split(" ");
            for (int i = 0; i < words.length; i++) {
                arrayList.add(words[i]);
            }
            Iterator<String> it = arrayList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


        }*/



    public String getLine() {
        return line;
    }

    public String getResult() {
        System.out.println(result.length());
        return result;
    }

    public String[] getWords() {
        System.out.println(words.length);

        return words;
    }

    @Override

    public Iterator<String> iterator() {
        return new WordIterator();
    }


    private class WordIterator implements Iterator<String> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            while (arrayList.size() <= counter) {
                counter++;

            }
            return true;
        }

        @Override
        public String next() {
            while (this.hasNext()) {
                counter++;
                arrayList.get(counter);
            }
            return arrayList.get(counter);
        }

        @Override
        public void remove() {


        }
    }

}
