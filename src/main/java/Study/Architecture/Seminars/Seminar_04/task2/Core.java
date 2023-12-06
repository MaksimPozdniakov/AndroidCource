package Study.Architecture.Seminars.Seminar_04.task2;

import lombok.Getter;

@Getter
public class Core {

    /**
     * -- GETTER --
     *  Внешний сервис
     * @return возвращает сервис по работе с покупателями
     */

    private final CustomerProvider customerProvider;

    /**
     * -- GETTER --
     *  Внешний сервис
     * @return возвращает сервис по работе с билетами
     */

    private final TicketProvider ticketProvider;

    private final PaymentProvider paymentProvider;
    private final Database database;

    public Core(){
        database = new Database();
        customerProvider = new CustomerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
    }


}
