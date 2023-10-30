package JavaCore.HomeWork.HW_04.task_01;

import JavaCore.HomeWork.HW_04.task_01.Exception.WrongLoginException;
import JavaCore.HomeWork.HW_04.task_01.Exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        // correct data
        String login = "123456qwerty";
        String password = "789563bvhfyn";
        String confirmPassword = "789563bvhfyn";

        // incorrect data
        String login2 = "123456qwerty";
        String password2 = "789563bvhfynо";
        String confirmPassword2 = "789563bvhfyn";

        System.out.println(Validation.checkRegInformation(login2,password2,confirmPassword2));;
    }
}
