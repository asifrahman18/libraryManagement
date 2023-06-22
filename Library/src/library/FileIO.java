package library;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class FileIO extends Admin{

    public FileIO() {
    }

    FileIO(String name, String email, String userID, String Pass, String Phone){
        String data ="User ID: "+ userID + " Name: " + name + " Email: " + email + " Phone: " + Phone + "\n";

        byte values[] = data.getBytes();
        byte value[] = Pass.getBytes();
        Path p = Paths.get("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\LibrarianFolder\\Details.txt");
        Path newFile = Paths.get("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\LibrarianFolder\\" + userID + ".txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(values, 0, data.length());
            out.close();
        } catch (IOException x) {
            System.err.println(x);
        }
        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(newFile, CREATE))) {
            out.write(value, 0, Pass.length());
        } catch (IOException x) {
            System.err.println(x);
        }
    }
    
    FileIO(String name, String email, String userID, String Phone){
        String data ="User ID: "+ userID + " Name: " + name + " Email: " + email + " Phone: " + Phone + "\n";

        byte values[] = data.getBytes();
        //byte value[] = Pass.getBytes();
        Path p = Paths.get("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\MemberFolder\\Details.txt");
        Path newFile = Paths.get("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\MemberFolder\\" + userID + ".txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(values, 0, data.length());
            out.close();
        } catch (IOException x) {
            System.err.println(x);
        }
        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(newFile, CREATE))) {
            //out.write(value, 0, Pass.length());
        } catch (IOException x) {
            System.err.println(x);
        }
    }
    
    
    FileIO(String name, String bookID, String bookNum, String receipt, double n){
        String data ="Book Name: "+ name + "\nID: " + bookID + "\nNumber of pieces: " + bookNum +"\nDiscount 15 Percent" + "\nFinal Price: " + n+"\n\n";

        byte values[] = data.getBytes();
        Path p = Paths.get("C:\\Users\\a184\\OneDrive\\Desktop\\library\\New folder\\Library\\Library\\src\\library\\Books\\Receipt.txt");

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(values, 0, data.length());
            out.close();
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    @Override
    public void changePass(String ID, String Pass) {

    }

    @Override
    public void changeID(String ID, String Pass) {

    }
}
