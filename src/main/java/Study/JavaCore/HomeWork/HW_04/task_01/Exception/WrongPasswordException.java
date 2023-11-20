package Study.JavaCore.HomeWork.HW_04.task_01.Exception;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){}

    public WrongPasswordException(String message) {
        super(message);
    }
}
