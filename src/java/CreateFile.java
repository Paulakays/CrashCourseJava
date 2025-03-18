package src.java;

import java.io.File;
import java.io.IOException;

/*
1. Create “CreateFile” class
2. Import File Class and IOException
3. Create File “my-file.txt”.
4. If a new file is created, get a file name and print “File created: ”, else print ”File is already exists.”
5. Handling Exception(try...catch)
5.1 When Exception thrown, catch print “Error has occurred.” and print stack trace.

More info - https://www.programiz.com/java-programming/exceptions
 */

public class CreateFile {
    public static void main (String[] args) {
        //5. Handling Exception(try...catch)
        try{
            //3. Create File “my-file.txt”
            File obj = new File ("my-file.txt");

            if(obj.createNewFile()){
                System.out.println("File created: " + obj.getName());
            }else {
                System.out.println("File is already exists.");
            }
        }catch (IOException e){
            System.out.println("Error has occurred.");
            e.printStackTrace();
        }
    }
}
