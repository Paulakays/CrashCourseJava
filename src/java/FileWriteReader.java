package src.java;

import java.io.*;

public class FileWriteReader {

    public static void main(String[] args) throws IOException {

        //Create a FileReader defined String
        String fileName = "my-file.txt";

        // Create a FileReader object to read from the file
        FileReader reader = new FileReader(fileName);

        // Initialize the variable to store each character read
        int i;

        // Read from the file until the end (i.e., when read() returns -1)
        while ((i = reader.read()) != -1){

            // Print each character as it is read
            System.out.print((char)i);

        }
        //9.Close the Reader
        reader.close();



    }


}



