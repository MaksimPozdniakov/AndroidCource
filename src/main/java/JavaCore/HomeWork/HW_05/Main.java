package JavaCore.HomeWork.HW_05;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        List<Integer> randomMarks = new ArrayList<>();
//        randomMarks.add(rnd.nextInt(5));
//        randomMarks.add(rnd.nextInt(5));
//        randomMarks.add(rnd.nextInt(5));
//        randomMarks.add(rnd.nextInt(5));
//        randomMarks.add(rnd.nextInt(5));

        List<Integer> randomMarks = new Random()
                .ints(5, 3, 6)
                .boxed()
                .toList();


//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Maksim", randomMarks, "Информатика"));
//        students.add(new Student("Yana", randomMarks, "Analyst"));
//        students.add(new Student("Inna", randomMarks, "Tester"));
//        students.add(new Student("Peter", randomMarks, "Android developer"));
//        students.add(new Student("Roma", randomMarks, "Programmer"));

        List<Student> students = Stream.of(
                        Student.builder().name("Maksim").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Yana").listMarks(randomMarks).specialization("Математика").build(),
                        Student.builder().name("Inna").listMarks(randomMarks).specialization("История").build(),
                        Student.builder().name("Peter").listMarks(randomMarks).specialization("Физика").build(),
                        Student.builder().name("Roma").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Nikola").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Tom").listMarks(randomMarks).specialization("Машиностроение").build(),
                        Student.builder().name("Katrin").listMarks(randomMarks).specialization("Математика").build(),
                        Student.builder().name("Tomas").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Brad").listMarks(randomMarks).specialization("История").build(),
                        Student.builder().name("Bill").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Megan").listMarks(randomMarks).specialization("Физика").build(),
                        Student.builder().name("Britni").listMarks(randomMarks).specialization("Информатика").build(),
                        Student.builder().name("Karol").listMarks(randomMarks).specialization("Машиностроение").build(),
                        Student.builder().name("Rob").listMarks(randomMarks).specialization("Информатика").build()
                )
                .toList();

        students.forEach(System.out::println);

    }
}
