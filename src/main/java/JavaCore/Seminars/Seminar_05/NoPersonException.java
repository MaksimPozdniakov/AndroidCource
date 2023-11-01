package JavaCore.Seminars.Seminar_05;

import JavaCore.Seminars.Seminar_03.Person;

public class NoPersonException extends RuntimeException {
    public NoPersonException(String id) {
        super("Отстуствует пользователь с id " + id);
    }
}
