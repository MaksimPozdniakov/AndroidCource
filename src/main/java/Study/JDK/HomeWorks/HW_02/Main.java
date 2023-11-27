package Study.JDK.HomeWorks.HW_02;

/*
    Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
    которые в состоянии писать серверный код, фронтендеры, которые могут программировать экранные формы,
    и фуллстэк разработчики, совмещающие в себе обе компетенции.
    Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
    все его методы.
 */

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Developer> developerList = Stream.of(
                new Backender(),
                new Frontander(),
                new Backender(),
                new Frontander(),
                new Backender(),
                new Frontander(),
                new Backender(),
                new Frontander()
        ).toList();

        for (Developer developer: developerList) {
            if (developer instanceof Frontander) {
                ((Frontander) developer).front();
            } else {
                System.out.println("Это не Frontender!");
            }
        }
    }
}
