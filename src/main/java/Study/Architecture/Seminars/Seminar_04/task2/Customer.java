package Study.Architecture.Seminars.Seminar_04.task2;

import lombok.Getter;
import java.util.ArrayList;
import java.util.Collection;

@Getter
public class Customer {

    private static int counter = 100;
    private final int id;
    private final String login;
    private final String password;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
        id = ++counter;
    }

//    public void setTickets(Collection<Ticket> tickets) {
//        this.tickets = tickets;
//    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

//    public void printTicket() {
//        for (Ticket ticket : tickets) {
//            System.out.println(ticket);
//        }
//    }

    public ArrayList printTicket() {
        return tickets;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
