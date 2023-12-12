package Study.Architecture.Seminars.Seminar_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Editor3D implements UILayer {

    private ProjectFile projectFile;
    private BusinessLogicalLayer businessLogicalLayer;
    private DatabaseAccess databaseAccess;
    private Database database;

    public Editor3D(){
    }

    private void initialize(){
        database = new EditorDatabase(projectFile);
        databaseAccess = new EditorDatabaseAccess(database);
        businessLogicalLayer = new EditorBusinessLogicalLayer(databaseAccess);
    }

    @Override
    public void openProject(String fileName) {
        projectFile = new ProjectFile(fileName);
        initialize();
    }

    @Override
    public void showProjectSettings() {

        System.out.println("*** Project v1 ***");
        System.out.println("******************");
        System.out.printf("fileName: %s\n", projectFile.getFileName());
        System.out.printf("setting1: %d\n", projectFile.getSetting1());
        System.out.printf("setting2: %s\n", projectFile.getSetting2());
        System.out.printf("setting3: %s\n", projectFile.getSetting3());
        System.out.println("******************");
    }

    @Override
    public void saveProject() {
        System.out.println("Изменения успешно сохранены.");
        database.save();
    }

    @Override
    public void printAllModels() {
        ArrayList<Model3D> models = (ArrayList<Model3D>)businessLogicalLayer.getAllModels();
        for (int i = 0; i < models.size(); i++){
            System.out.printf("===%d===\n", i);
            System.out.println(models.get(i));
            for (Texture texture: models.get(i).getTextures()) {
                System.out.printf("\t%s\n", texture);
            }
        }
    }

    @Override
    public void printAllTextures() {
        ArrayList<Texture> textures = (ArrayList<Texture>)businessLogicalLayer.getAllTextures();
        for (int i = 0; i < textures.size(); i++){
            System.out.printf("===%d===\n", i);
            System.out.println(textures.get(i));
        }
    }

    @Override
    public void renderAll() {
        System.out.println("Подождите ...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderAllModels();
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Операция выполнена за %d мс.\n", endTime);
    }

    @Override
    public void renderModel(int i) {
        ArrayList<Model3D> models = (ArrayList<Model3D>)businessLogicalLayer.getAllModels();
        if (i < 0 || i > models.size() - 1)
            throw new RuntimeException("Номер модели указан некорректною.");
        System.out.println("Подождите ...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderModel(models.get(i));
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Операция выполнена за %d мс.\n", endTime);
    }

    @Override
    public void removeModel(UserModel model) {
        databaseAccess.removeEntity(model);
    }

    public UserModel removeModelMethod() {
        Collection<Entity> list = database.printUserModels();
        ArrayList<UserModel> list2 = new ArrayList<>();
        for (Entity entity: list) {
            list2.add((UserModel)entity);
        }

        System.out.println("Введите номер определи модели сверху вниз");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return list2.get(number - 1);
    }

    @Override
    public void addModel(UserModel model) {
        databaseAccess.addEntity(model);
    }

    public UserModel createNewModelFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Название модели: ");
        String name = scanner.nextLine();

        System.out.print("Размер модели: ");
        String size = scanner.nextLine();

        System.out.print("Тип модели: ");
        String type = scanner.nextLine();

        return new UserModel(name, size, type);
    }

    public void print() {
        Collection<Entity> list = database.printUserModels();
        for (Entity entity: list) {
            System.out.println(entity);
        }
    }
}
