package Application.Errors;

public class VideoGameNotFoundException extends RuntimeException{
    VideoGameNotFoundException(int id){
        super("Could not find video game " + id);
    }

    VideoGameNotFoundException(String name){
        super("Could not find video game " + name);
    }
}
