package Study.Architecture.HomeWorks.HomeWork_01.ModelElements;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Сцена
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Scene {

    public <T> T method1(T t) {
        return t;
    }

    public <T> T method2(T t1, T t2) {
        T someTypeValue = null;
        return someTypeValue;
    }


    // region Поля

    private int id;
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();

    // endregion
}
