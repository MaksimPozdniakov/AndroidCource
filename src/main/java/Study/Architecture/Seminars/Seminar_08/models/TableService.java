package Study.Architecture.Seminars.Seminar_08.models;


import Study.Architecture.Seminars.Seminar_08.presenters.Model;
import lombok.Getter;

import java.util.*;

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

    // меняем резервирование
    @Override
    public int changeReservationTable(int oldReservation) {
        int tableNumber = 0;
        String name = "";

        Iterator<Reservation> iterator = reservationList.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getId() == oldReservation) {
                tableNumber = reservation.getTableNumber();
                name = reservation.getName();
                iterator.remove();
            }
        }

        for (Table table : tables) {
            if (table.getNo() == tableNumber) {
                Reservation reservation = new Reservation(table, new Date(), name);
                table.getReservations().add(reservation);

                // Запись всех записей резервирования в один список
                reservationList.add(reservation);

                return reservation.getId();
            }
        }
        throw new RuntimeException("Ошибка изменения брони");
    }


    @Override
    public List<Reservation> getReservationList() { // возвращаем список резервирований
        return reservationList;
    }

    @Override
    public void dellReservation(int id) { // отменяем резервирование столика
        Iterator<Reservation> iterator = reservationList.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getId() == id) {
                iterator.remove();
            }
        }
    }

}