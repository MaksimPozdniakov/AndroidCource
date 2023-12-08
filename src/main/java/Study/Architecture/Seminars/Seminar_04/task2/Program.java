package Study.Architecture.Seminars.Seminar_04.task2;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     * @param args
     */
    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        mobileApp.getData();

        // Получаем результат оплаты
        System.out.println();
        System.out.println("\tОплачиваем....");
        boolean result = mobileApp.buyTicket("1000000000001");

        // Проверяем результат оплаты
        if (result) {
            System.out.println("\tОплата прошла! ");
            System.out.println();
            mobileApp.addTicket();
        }

        // Выводим информацию о билетах покупателя
        mobileApp.printTicket();

    }

}
