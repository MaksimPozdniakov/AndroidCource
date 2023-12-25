package Study.Architecture.Seminars.Seminar_08.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateUILoadTables(){
        view.showTables(model.loadTables());
    }

    public void updateUIReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIReservationTableResult(reservationNo);
        }
        catch (Exception e){
            updateUIReservationTableResult(-1);
        }
    }

    // блок с тестами
    // Вывод списка всех записей резервирования
    public void showReservationList() {
        view.getReservationList(model.getReservationList());
    }

    @Override
    public void dellReservation(int id) {
        model.dellReservation(id);
    }

    @Override
    public void changeReservationTable(int oldReservation) {
        int reservation = model.changeReservationTable(oldReservation);
        updateUIReservationTableResult(reservation);
    }

}
