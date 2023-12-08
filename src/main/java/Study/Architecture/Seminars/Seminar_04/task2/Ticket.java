package Study.Architecture.Seminars.Seminar_04.task2;

import lombok.Getter;
import java.util.Date;

@Getter
class Ticket{

    static int counter = 4000;
    private final int id;
    private int customerId;
    private Date date;
    private String qrcode;

    public Ticket(){
        date = new Date();
        qrcode = "Q";
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "id=" + id +
                ", customerId=" + customerId +
                ", date=" + date +
                ", qrcode='" + qrcode + '\'' +
                '}';
    }
}
