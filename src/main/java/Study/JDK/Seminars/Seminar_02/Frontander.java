package Study.JDK.Seminars.Seminar_02;

public class Frontander extends Developer implements FrontandAction {
    @Override
    public void front() {
        System.out.println("Frontender working");
    }
}
