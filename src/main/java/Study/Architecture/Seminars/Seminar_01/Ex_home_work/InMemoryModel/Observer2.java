package Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel;

public class Observer2 implements ModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Observer2 реагирует на изменения ...");
    }
}