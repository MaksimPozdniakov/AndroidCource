package Study.JavaCore.HomeWork.HW_04.task_01;

import Study.JavaCore.HomeWork.HW_04.task_01.Exception.WrongLoginException;
import Study.JavaCore.HomeWork.HW_04.task_01.Exception.WrongPasswordException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Validation {

    public static boolean  checkRegInformation(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Длина login должна быть меньше 20 символов!");
            } else if (password.length() >= 20) {
                throw new WrongPasswordException("Длина password должна быть меньше 20 символов!");
            } else if (password.length() != confirmPassword.length()) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

}
