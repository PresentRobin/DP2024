package Application.Errors;

public class MovieNotFoundException extends RuntimeException {
    MovieNotFoundException(int id){
        super("Could not find movie " + id);
    }

    MovieNotFoundException(String title){
        super("Could not find movie " + title);
    }
}
