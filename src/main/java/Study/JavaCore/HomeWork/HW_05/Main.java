package Study.JavaCore.HomeWork.HW_05;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Stream.of(
                        new Student("Maksim", randomMarksList(), "Информатика"),
                        new Student("Yana", randomMarksList(), "Математика"),
                        new Student("Inna", randomMarksList(), "История"),
                        new Student("John", randomMarksList(), "Физика"),
                        new Student("Elena", randomMarksList(), "Информатика"),
                        new Student("David", randomMarksList(), "Информатика"),
                        new Student("Anna", randomMarksList(), "Литература"),
                        new Student("Alex", randomMarksList(), "Информатика"),
                        new Student("Olga", randomMarksList(), "Математика"),
                        new Student("Robert", randomMarksList(), "История"),
                        new Student("Sophia", randomMarksList(), "Физика"),
                        new Student("Michael", randomMarksList(), "Биология"),
                        new Student("Laura", randomMarksList(), "Информатика"),
                        new Student("Daniel", randomMarksList(), "Литература"),
                        new Student("Emma", randomMarksList(), "Информатика"),
                        new Student("Sophie", randomMarksList(), "Информатика"),
                        new Student("Jack", randomMarksList(), "Математика"),
                        new Student("Liam", randomMarksList(), "История"),
                        new Student("Ava", randomMarksList(), "Физика"),
                        new Student("Noah", randomMarksList(), "Информатика"),
                        new Student("Olivia", randomMarksList(), "Информатика"),
                        new Student("Lucas", randomMarksList(), "Литература"),
                        new Student("Emma", randomMarksList(), "Информатика"),
                        new Student("Benjamin", randomMarksList(), "Математика"),
                        new Student("Charlotte", randomMarksList(), "История")
                )
                .toList();
        students.forEach(System.out::println);


        System.out.println();
        System.out.println("SortList:");
        List<Student> sortedStudents = students.stream()
                .filter(student -> student.middleMarkMethod() > 4.5)
                .sorted(Comparator.comparingDouble(Student::middleMarkMethod).reversed())
                .limit(5)
                .toList();
        sortedStudents.forEach(System.out::println);
    }

    private static List<Integer> randomMarksList() {
        return new Random()
                .ints(10, 4, 6)
                .boxed()
                .toList();
    }

}