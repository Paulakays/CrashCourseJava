package src.java;

//Import File Class and IOException
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public static void main(String[] args) {
        //Initialise new file
        MyFile myFile = new MyFile("my-file.txt");

        //Check if a new file has been created
        if (MyFile.getFile().exists()) {

        //use try to define code and test for errors
            try {
                //Initialise a new Filewriter, get the file created
                FileWriter writer = new FileWriter(myFile.getFile());

                //print "Files in Java is fun enough!" using write method
                writer.write("Files in Java is fun enough!");
                writer.close();

                //print out success
                System.out.println("Successfully wrote to the file.");

        }
            //use catch to define code to be executed if an error occurs during trial
            catch(IOException e){

                //print out error
            System.out.println("Error has occurred.");
            e.printStackTrace();
        }
        }

    }
    }
