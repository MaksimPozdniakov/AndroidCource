package Study.Architecture.Seminars.Seminar_04.task2;

import java.util.Collection;
import java.util.Date;

/**
 * Мобильное приложение
 */
public class MobileApp {

    private Database database = new Database();
    private final Customer customer;
    private final TicketProvider ticketProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider){
        this.ticketProvider = ticketProvider;

        customer = customerProvider.getCustomer("Maksim", "password");
        database.addNewCustomer(customer);
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public boolean buyTicket(String cardNo){
        return ticketProvider.buyTicket(customer.getId(), cardNo);
    }



















//    public void searchTicket(Date date){
//        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
//    }

}
