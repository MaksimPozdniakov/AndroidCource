package Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel;



import Study.Architecture.HomeWorks.HomeWork_01.ModelElements.Camera;
import Study.Architecture.HomeWorks.HomeWork_01.ModelElements.Flash;
import Study.Architecture.HomeWorks.HomeWork_01.ModelElements.PoligonalModel;
import Study.Architecture.HomeWorks.HomeWork_01.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Хранилище 3D-элементов
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class ModelStore implements ModelChanger {

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    public void addModel(PoligonalModel poligonalModel){
        notifyChange();
    }

    /**
     * Нотификация изменений на уровне хранилища
     */
    private void notifyChange(){
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    private Scene getScene(int num) {
        List<Scene> sceneList = new ArrayList<>(scenes);
        return sceneList.get(num);
    }

    // region Поля

    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<ModelChangedObserver> observers = new ArrayList<>();

    //endregion

}
