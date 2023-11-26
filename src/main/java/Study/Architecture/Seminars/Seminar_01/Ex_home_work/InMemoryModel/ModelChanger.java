package Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel;

public interface ModelChanger {

    void registerModelChanger(ModelChangedObserver o);
    void removeModelChanger(ModelChangedObserver o);

}
