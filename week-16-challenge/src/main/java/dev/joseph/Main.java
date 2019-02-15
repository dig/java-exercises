package dev.joseph;

import dev.joseph.list.LinkedList;

import java.io.*;
import java.nio.charset.Charset;

/*
 * @author Joseph.
 *
 * I'm using an dependency manager called Maven so
 * when you build this project, make sure you run
 * 'mvn clean install' or use a maven addon for your
 * IDE.
 */

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        //--- Load data file into memory (using resources folder to store the file).
        LinkedList list = null;
        try {
            list = this.loadIntoMemory("885013_data.txt");

            //--- Loop over alphabet and count each character.
            FileWriter fw = new FileWriter(Constants.FILE_OUTPUT);

            for (char character : Constants.ALPHABET) {
                fw.write(character + ":" + list.count(character) + System.lineSeparator());
            }

            //--- Flush and close opened file.
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private LinkedList loadIntoMemory(String fileName) throws IOException {
        LinkedList result = new LinkedList();

        //--- Read each character from file.
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(Constants.FILE_INPUT),
                        Charset.forName("UTF-8")));

        //--- Add to our linked list.
        int c;
        while((c = reader.read()) != -1) {
            result.add((char) c);
        }

        return result;
    }

    private void testLinkedList() {
        LinkedList myList = new LinkedList();

        myList.add('a');
        myList.add('b');
        myList.add('c');

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());

        System.out.println("\nRemoving character 'a'");
        myList.delete('a');

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());

        System.out.println("\nRemoving index 1");
        myList.delete(1);

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());

        System.out.println("Contains 'b': " + myList.contains('b'));
    }

}
