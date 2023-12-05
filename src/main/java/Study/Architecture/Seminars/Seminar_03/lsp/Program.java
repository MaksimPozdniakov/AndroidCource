package Study.Architecture.Seminars.Seminar_03.lsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Penguin penguin = new Penguin();

        List<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(duck1);
        birds.add(duck2);
        birds.add(penguin);
        processFly(birds);
    }
    public static void processFly(Collection<Bird> birds){
        for (Bird bird: birds) {
            if (bird.isCanFly())
                bird.fly();
        }
    }
}
