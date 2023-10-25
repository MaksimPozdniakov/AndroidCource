package JavaCore.Seminars.Seminar_02.yandex_task_01.fromGPT;

public class Main {
    public static void main(String[] args) {
        ConstantTimeSet set = new ConstantTimeSet();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.contains(2));  // true
        System.out.println(set.contains(4));  // false

        set.remove(2);

        System.out.println(set.contains(2));  // false

        int randomValue = set.getRandomValue();
        System.out.println(randomValue);
    }
}
