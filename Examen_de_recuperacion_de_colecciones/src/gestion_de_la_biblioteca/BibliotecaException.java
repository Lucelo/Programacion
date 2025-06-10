package gestion_de_la_biblioteca;

public class BibliotecaException extends Throwable {

    private String message;

    public BibliotecaException(String s) {
    }

    public String getMessage() {
        return message;
    }


}
