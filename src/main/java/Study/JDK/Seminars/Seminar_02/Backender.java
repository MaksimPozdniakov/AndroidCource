package Study.JDK.Seminars.Seminar_02;

public class Backender extends Developer implements BackendAction {
    @Override
    public void back() {
        System.out.println("Backender working");
    }
}
