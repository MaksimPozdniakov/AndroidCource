package Study.Architecture.HomeWorks.HomeWork_01.ModelElements;

import java.awt.*;

/**
 * Источник света
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Flash {


    public void move(Point3D point3D) {
        // какое-то действие
    }

    public void rotate(Angle3D angle) {
        // какое-то действие
    }

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }


    // region Поля

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    // endregion
}
