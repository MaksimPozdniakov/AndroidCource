package Study.JavaCore.Test.Test_02;

public interface Test {
    static void printStatic() {
        System.out.println("Статический метод!");
    }

    default void printDefault(int a) {
        System.out.println("Число " + a);
        printPrivate();
    }

    private void printPrivate() {
        System.out.println("Приватный метод!");
    }
}
