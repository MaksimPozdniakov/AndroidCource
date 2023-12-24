package Study.Architecture.Seminars.Seminar_08.models;


import Study.Architecture.Seminars.Seminar_08.presenters.Model;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class TableService implements Model {

    private Collection<Table> tables;

    private List<Reservation> reservationList = new ArrayList<>();

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);

                // Запись всех записей резервирования в один список
                reservationList.add(reservation);

                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }


    @Override
    public List<Reservation> getReservationList() { // возвращаем список резервирований
        return reservationList;
    }

    @Override
    public void dellReservation(int id) { // отменяем резервирование столика
        for (Reservation reservation: reservationList) {
            if (reservation.getId() == id) {
                reservationList.remove(reservation);
            }
        }
    }

    // меняем резервирование
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        return -1;
    }


}