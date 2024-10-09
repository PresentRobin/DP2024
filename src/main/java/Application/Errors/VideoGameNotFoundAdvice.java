package Application.Errors;

import Application.Errors.VideoGameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class VideoGameNotFoundAdvice {

    @ExceptionHandler(VideoGameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(VideoGameNotFoundException ex) {
        return ex.getMessage();
    }
}