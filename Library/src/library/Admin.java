package library;

import java.io.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public abstract class Admin implements ChangeCredentials{
    
    
    public void removeLibrarian(String ID, String name, String email, String phone) throws IOException {

        
        //Creating the string to remove
        String lineToRemove = "User ID: "+ ID + " Name: " + name + " Email: " + email + " Phone: " + phone;

        
        //File path
        File file = new File("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\LibrarianFolder\\Details.txt");
        try {

            File inFile = new File(String.valueOf(file));

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            //Creating a temporary file
            File tempFile = new File("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\LibrarianFolder" + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            //Writing in the new file
            while ((line = br.readLine()) != null) 
            {

                if (!line.trim().equals(lineToRemove)) 
                {

                    pw.println(line);
                    pw.flush();
                }
            }
      pw.close();
      br.close();

      if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      }

      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
    
}
    

