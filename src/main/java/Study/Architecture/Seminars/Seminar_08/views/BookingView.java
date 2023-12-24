package Study.Architecture.Seminars.Seminar_08.views;


import Study.Architecture.Seminars.Seminar_08.models.Reservation;
import Study.Architecture.Seminars.Seminar_08.models.Table;
import Study.Architecture.Seminars.Seminar_08.presenters.View;
import Study.Architecture.Seminars.Seminar_08.presenters.ViewObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        else
            System.out.println("Не удалось забронировать столик. Повторите попытку позже.");

    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){

    }


    public void reservationTable(Date orderDate, int tableNo, String name){
        for (ViewObserver observer : observers){
            observer.onReservationTable(orderDate, tableNo, name);
        }
    }

    // Вывод списка всех записей резервирования
    @Override
    public void showReservationList(List<Reservation> reservationList) {
        for (Reservation reservation : reservationList) {
            System.out.println(reservation);
        }
    }

    @Override
    public void dellReservation(int id) {

    }


}
