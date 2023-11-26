package Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel;

public class Observer1 implements ModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Observer1 реагирует на изменения ...");
    }
}
