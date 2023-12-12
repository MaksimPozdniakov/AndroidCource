package Study.Architecture.Seminars.Seminar_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EditorDatabase implements Database {

    private final ProjectFile projectFile;
    private Collection<Entity> entities = new ArrayList<>();
    private Random random = new Random();

    public EditorDatabase(ProjectFile projectFile){
        this.projectFile = projectFile;
        load();
    }

    @Override
    public void load() {
        //TODO: Загрузка всех сущностей проекта (модели, текстуры)
    }

    @Override
    public void save() {
        //TODO: Сохранение текущего состояния всех сущностей проекта
    }

    @Override
    public Collection<Entity> getAll() {
        // Ленивая загрузка
        if (entities == null){
            entities = new ArrayList<>();
            int modelsCount = random.nextInt(5, 11); // 5 - 10
            for (int i = 0; i < modelsCount; i++)
                generateModelAndTextures();
        }

        return entities;
    }

    // region add_Entity
    @Override
    public void addEntity(Entity entity) {
        saveNewEntity(entity);
    }

    private void saveNewEntity(Entity entity) {
        entities.add(entity);
    }

    @Override
    public Collection<Entity> printUserModels() {
        return entities;
    }

    // endregion

    @Override
    public void removeEntity(Entity entity) {
        if (entities != null) {
            entities.remove(entity);
        }
    }

    private void generateModelAndTextures(){
        Model3D model = new Model3D();
        int textureCount = random.nextInt(3);
        for (int i = 0; i < textureCount; i++){
            Texture texture = generateTexture();
            model.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model);
    }

    private Texture generateTexture(){
        return new Texture();
    }
}
