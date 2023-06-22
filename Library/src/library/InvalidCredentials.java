package library;

public class InvalidCredentials extends Exception{
    InvalidCredentials(){
        super();
    }
    InvalidCredentials(String message){
        super(message);
    }
}
