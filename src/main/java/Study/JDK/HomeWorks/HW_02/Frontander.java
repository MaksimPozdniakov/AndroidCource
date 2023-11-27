package Study.JDK.HomeWorks.HW_02;

public class Frontander extends Developer implements FrontandAction {
    @Override
    public void front() {
        System.out.println("Frontender working");
    }
}
