package Study.Architecture.Seminars.Seminar_04.task2;

public class PaymentProvider {

    public boolean buyTicket(int orderId, String cardNo, double amount) {
        // делаю обычную проверку на наличие переданных данных
        return orderId > 0 && !cardNo.isEmpty() && amount > 0;
    }
}
