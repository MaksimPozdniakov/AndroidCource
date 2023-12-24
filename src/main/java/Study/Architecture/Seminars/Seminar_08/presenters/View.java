package Study.Architecture.Seminars.Seminar_08.presenters;


import Study.Architecture.Seminars.Seminar_08.models.Reservation;
import Study.Architecture.Seminars.Seminar_08.models.Table;
import java.util.Collection;
import java.util.List;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);


    // блог с тестами
    void showReservationList(List<Reservation> reservationList); // Вывод списка всех записей резервирования
    void dellReservation(int id);

}
