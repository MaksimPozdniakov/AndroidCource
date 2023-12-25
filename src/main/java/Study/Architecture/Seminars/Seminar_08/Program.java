package Study.Architecture.Seminars.Seminar_08;

import Study.Architecture.Seminars.Seminar_08.models.TableService;
import Study.Architecture.Seminars.Seminar_08.presenters.BookingPresenter;
import Study.Architecture.Seminars.Seminar_08.presenters.Model;
import Study.Architecture.Seminars.Seminar_08.views.BookingView;
import java.util.Date;

public class Program {

    /**
     * TODO: Домашнее задание - метод changeReservationTable заработал!
     * @param args
     */
    public static void main(String[] args) {

        Model tableService = new TableService();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableService, bookingView);

        // Метод выводит все столы
        System.out.println("Все столы в зале");
        bookingPresenter.updateUILoadTables();
        System.out.println();

        // метод осуществляет бронирование столика и возвращает ID Rezervation
        System.out.println("Процесс бронирования");
        bookingView.reservationTable(new Date(), 1, "Станислав");
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 4, "Станислав");
        bookingView.reservationTable(new Date(), 5, "Станислав");
        System.out.println();

        // Вывод списка всех записей резервирования
        System.out.println("Все записи до отмены");
        bookingPresenter.showReservationList();
        System.out.println();

        // Отменяем запись
        bookingView.dellReservation(1001);

        // Вывод списка всех записей резервирования
        System.out.println("Все записи после отмены");
        bookingPresenter.showReservationList();
        System.out.println();

        // Меняем запись
        bookingView.changeReservationTable(1002);

        // Вывод списка всех записей резервирования
        System.out.println("Все записи после изменения");
        bookingPresenter.showReservationList();
        System.out.println();

    }

}
