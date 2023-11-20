package Study.JavaCore.Seminars.Seminar_02.yandex_task_02.from_seminar;

public class NoBanknotesToWithdrawException extends RuntimeException{
    public NoBanknotesToWithdrawException(int amount) {
        super(String.format("Запрашиваемая сумма(%s) не может быть выдана", amount));
    }
}