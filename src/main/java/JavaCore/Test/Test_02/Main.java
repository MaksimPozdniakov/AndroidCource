package JavaCore.Test.Test_02;

public class Main implements Test{
    public static void main(String[] args) {
        Test.printStatic();  // <-- так мы можем вызвать только static метод <-- без имплементации
        var foo = new Main();
        foo.printDefault(5);
    }
}
