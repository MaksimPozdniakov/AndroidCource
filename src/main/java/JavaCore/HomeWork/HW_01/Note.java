package JavaCore.HomeWork.HW_01;

import java.time.LocalDate;

public class Note {
    private String text;

    public Note(String text) {
        this.text = text;
    }

    private String getDate() {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        return day + "." + month + "." + year;
    }

    public String toString() {
        return getDate() + " -> " + text;
    }

}
