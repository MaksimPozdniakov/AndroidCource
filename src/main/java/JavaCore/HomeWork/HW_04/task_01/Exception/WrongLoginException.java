package JavaCore.HomeWork.HW_04.task_01.Exception;

public class WrongLoginException extends Exception {

    public WrongLoginException(){}

    public WrongLoginException(String message) {
        super(message);
    }
}
