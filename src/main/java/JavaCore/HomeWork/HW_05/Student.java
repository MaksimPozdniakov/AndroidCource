package JavaCore.HomeWork.HW_05;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> listMarks;
    private String specialization;
    private double middleMark;

    public Student(String name, List<Integer> listMarks, String specialization) {
        this.name = name;
        this.listMarks = listMarks;
        this.specialization = specialization;
        this.middleMark = middleMarkMethod();
    }

    public Double middleMarkMethod() {
        return listMarks.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Средний балл: " + middleMark +
                "| " + name + ", " +
                specialization + ", " +
                listMarks;
    }
}
