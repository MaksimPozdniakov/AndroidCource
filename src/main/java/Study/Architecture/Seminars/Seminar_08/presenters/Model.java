package Study.Architecture.Seminars.Seminar_08.presenters;


import Study.Architecture.Seminars.Seminar_08.models.Reservation;
import Study.Architecture.Seminars.Seminar_08.models.Table;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation);

    // блог с тестами
    List<Reservation> getReservationList(); // возвращаем список всех записей резервирования
    void dellReservation(int id); // отменяем резервирование столика

}
