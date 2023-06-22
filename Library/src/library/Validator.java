package library;

public class Validator {
    private boolean admin_all_valid = true;
    public Validator(String ID, String Pass) throws InvalidInput {
        if(ID.length() < 0 || Pass.length() < 5){
            admin_all_valid = runValidatorAdminID(ID);
            admin_all_valid =  runValidatorAdminPass(Pass);
        }
        if(!admin_all_valid){
            throw new InvalidInput("Invalid input!");
        }
    }

    private boolean runValidatorAdminPass(String adminPass) {
        return (adminPass.length() > 5);
    }

    private boolean runValidatorAdminID(String adminID) {
        return (adminID.length() > 0);
    }
}
