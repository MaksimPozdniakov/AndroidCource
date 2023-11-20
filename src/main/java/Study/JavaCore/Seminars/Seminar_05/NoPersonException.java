package Study.JavaCore.Seminars.Seminar_05;

public class NoPersonException extends RuntimeException {
    public NoPersonException(String id) {
        super("Отстуствует пользователь с id " + id);
    }
}
