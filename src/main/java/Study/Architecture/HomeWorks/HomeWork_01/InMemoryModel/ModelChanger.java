package Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel;

public interface ModelChanger {

    void registerModelChanger(ModelChangedObserver o);
    void removeModelChanger(ModelChangedObserver o);

}
