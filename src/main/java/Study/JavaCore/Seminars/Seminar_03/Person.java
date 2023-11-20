package Study.JavaCore.Seminars.Seminar_03;

import lombok.*;

@Data // + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private String name;
    private int age;
    private int salary;

    public Person(int age) {
        this.age = age;
    }
}
