package Study.Architecture.Seminars.Seminar_04.task2;

import java.util.ArrayList;
import java.util.Collection;

public class Database {

    public Database(){}
    private static int counter = 100;
    private final Collection<Customer> customers = new ArrayList<>();

    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }


    /**
     * Получить актуальную стоимость билета
     * @return
     */
    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }
}
