package src.java;

// Import the File class from the java.io package
import java.io.File;

    // Define a public class named MyFile
    public class MyFile {
        private static File file;

        //create a method MyFile to enable access of the file to Write.File.java
        public MyFile(String filename) {
            this.file = new File("my-file.txt");
        }

        //Create method getFile to enable access to Write.File.java
        public static File getFile() {
            return file;
        }

        // Main method: entry point of the program
        public static void main(String[] args) {
            // Create a File object representing the user's home directory
            File home = new File(System.getProperty("user.home"));

            // Check if the home path is a directory
            if (home.isDirectory()) {
                // List all files and directories in the home directory
                File[] files = home.listFiles();

                // Check if the files array is not null
                if (files != null) {
                    // Iterate through each file in the files array
                    for (File file : files) {
                        // Print the name of each file or directory
                        System.out.println(file.getName());
                    }
                } else {
                    // Print an error message if files cannot be listed
                    System.out.println("Could not list files in the home directory. Please check the permissions.");
                }
            } else {
                // Print an error message if home is not a directory
                System.out.println("The path specified is not a Directory.");
            }
        }

}
