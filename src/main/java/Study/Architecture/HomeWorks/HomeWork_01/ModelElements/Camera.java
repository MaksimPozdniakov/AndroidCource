package Study.Architecture.HomeWorks.HomeWork_01.ModelElements;

/**
 * Камера
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Camera {

    public void move(Point3D point3D) {
        // какое-то действие
    }

    public void rotate(Angle3D angle) {
        // какое-то действие
    }


    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }


    // region Поля

    private Point3D location;
    private Angle3D angle;

    // endregion
}
