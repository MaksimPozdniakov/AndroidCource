package Study.Architecture.Seminars.Seminar_05;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();

    Collection<Entity> getAll();

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Entity> printUserModels();

}
