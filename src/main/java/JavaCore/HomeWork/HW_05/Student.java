package JavaCore.HomeWork.HW_05;

import lombok.Builder;
import java.util.List;

@Builder
public class Student {
    private String name;
    private List<Integer> listMarks;
    private String specialization;

    public Student(String name, List<Integer> listMarks, String specialization) {
        this.name = name;
        this.listMarks = listMarks;
        this.specialization = specialization;
    }

    public Double middleMarkMethod() {
        return listMarks.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "name: " + name + ", specialization: " + specialization + ", listMarks: " + listMarks;

    }
}
