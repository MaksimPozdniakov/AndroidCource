package Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel;

public class Observer1 implements ModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Observer1 реагирует на изменения ...");
    }
}
