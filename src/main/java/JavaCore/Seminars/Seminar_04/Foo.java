package JavaCore.Seminars.Seminar_04;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Foo implements ITest {

    public static void main(String[] args) {
        var foo = new Foo();
/*        ITest.test();

        foo.testDefault(5);*/

        Runnable runnable = new MyRunnable();
        runnable.run();

        Runnable anonRun = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, анонимный ран!");
            }
        };

        Runnable lambdaRun = () -> System.out.println("Привет, лямбда ран!");
        //StreamAPI
        //map
        //Optional

        lambdaRun.run();
        anonRun.run();

        List<Integer> list = List.of(1, 2, 3, 4);
        list.forEach((n) -> {
            System.out.print("Число: ");
                System.out.println(n * 5);
            });

        //reflection
//        Class<Foo> classF = Foo.class;
        Class<Foo> classF = (Class<Foo>) foo.getClass();
        for (Method method : classF.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
