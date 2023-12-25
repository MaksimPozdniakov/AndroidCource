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
        bookingPresenter.updateUILoadTables();
        System.out.println();

        // метод осуществляет бронирование столика и возвращает ID Rezervation
        bookingView.reservationTable(new Date(), 1, "Станислав");
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 4, "Станислав");
        bookingView.reservationTable(new Date(), 5, "Станислав");
        System.out.println();

        // Вывод списка всех записей резервирования
        bookingPresenter.showReservationList();















        //bookingView.changeReservationTable(1001, new Date(), 1, "Станислав");

    }

}
