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

    public void getData() {
        System.out.println(database.getCustomers());
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public boolean buyTicket(String cardNo){
        return ticketProvider.buyTicket(customer.getId(), cardNo);
    }

    public void addTicket() {
        customer.addTicket(ticketProvider.getTicket());
        customer.addTicket(ticketProvider.getTicket());
        customer.addTicket(ticketProvider.getTicket());
    }

    public void printTicket() {
        for (int i = 0; i < customer.printTicket().size(); i++) {
            System.out.println(customer.printTicket().get(i));
        }
    }

//    public void searchTicket(Date date){
//        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
//    }

}
