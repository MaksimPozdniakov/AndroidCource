package Study.Architecture.Seminars.Seminar_08.presenters;


import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);
    void dellReservation(int id);
    void changeReservationTable(int oldReservation);
}
