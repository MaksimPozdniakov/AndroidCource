package Study.Architecture.Seminars.Seminar_04.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     * @param args
     */
    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
//        mobileApp.buyTicket("1000000000001");
//        System.out.println(mobileApp.getTickets());
        System.out.println(core.getDatabase().getCustomers());

    }

}
