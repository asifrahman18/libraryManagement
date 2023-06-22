package library;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Authenticator {

    Authenticator(String ID, String Pass, int mark) throws InvalidCredentials {
        Path path = null;
        if(mark == 0)
        {
            path= Path.of("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\AdminFolder\\" + ID + ".txt");
        }
        else if(mark == 1)
        {
            path= Path.of("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\LibrarianFolder\\" + ID + ".txt");
        }

        try (InputStream in = Files.newInputStream(path);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) 
            {
                boolean is_correct = true;
                System.out.println(Pass.length() + " " + line.length());
                System.out.println(Pass + " " + line);
                is_correct = checkPass(Pass, line);
                if(!is_correct)
                {
                    throw new InvalidCredentials("Invalid credentials");
                }
            }
        } catch (IOException x) 
        {
            throw new InvalidCredentials("Invalid Credentials");
        }
    }

    private boolean checkPass(String Pass,String line) 
    {
        boolean valid = true;
        if(Pass.length() == line.length())
        {
            for(int i = 0;i<Pass.length();i++)
            {
                valid = checkPassEqual(Pass.charAt(i), line.charAt(i));
                if(!valid)return valid;
            }
        }
        else
        {
            return false;
        }
        return true;
    }
    private boolean checkPassEqual(char a, char b)
    {
        return a == b;
    }
}
