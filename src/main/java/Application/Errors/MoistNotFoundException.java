package Application.Errors;

public class MoistNotFoundException extends RuntimeException{
    MoistNotFoundException(int id){
        super("Could not find moist " + id);
    }

    MoistNotFoundException(String title){
        super("Could not find moist " + title);
    }
}
