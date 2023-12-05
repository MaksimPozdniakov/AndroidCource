package Study.Architecture.Seminars.Seminar_03;

public class ServiceStation implements Refueling, Wiping{
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void wipMirrors() {
        System.out.println("Протираем зеркала....");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Заливаем стеклоомыватель....");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протираем фары....");
    }
}
