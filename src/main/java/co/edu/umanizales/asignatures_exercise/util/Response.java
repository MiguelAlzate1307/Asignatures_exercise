package co.edu.umanizales.asignatures_exercise.util;

public class Response<T> {
    private T data;
    private String message;

    public Response(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
