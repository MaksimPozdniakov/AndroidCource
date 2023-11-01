package JavaCore.Seminars.Seminar_05;

import JavaCore.Seminars.Seminar_03.Person;

import java.sql.SQLOutput;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var personRepository = new PersonRepository();
        Optional<Person> personOptional = personRepository.findById("id1");
        if (personOptional.isPresent()) {
            Person person = personOptional.get();
            System.out.println(person);
        }

        personOptional.ifPresent(person -> System.out.println(person));

        Person defaultPerson = new Person();
        Person person = personRepository.findById("id1").orElse(defaultPerson);
//        System.out.println(person);

        Person person1 = personRepository.findById("id1")
                .orElseGet(() -> Person.builder()
                        .name("Default")
                        .salary(100000)
                        .age(12)
                        .build());
        System.out.println(person1);

        String id = "id";
        String name = personRepository.findById(id)
                .map(Person::getName)
                .orElseThrow(() -> new NoPersonException(id));

        System.out.println(name);
    }
}
