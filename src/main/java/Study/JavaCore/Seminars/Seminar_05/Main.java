package Study.JavaCore.Seminars.Seminar_05;

import Study.JavaCore.Seminars.Seminar_03.Person;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var personRepository = new PersonRepository();
        Optional<Person> personOptional = personRepository.findById("id1");
        if (personOptional.isPresent()) {
            Person person = personOptional.get();
            System.out.println(person);
        }

        personOptional.ifPresent(System.out::println);

//        Person defaultPerson = new Person();
//        Person person = personRepository.findById("id1").orElse(defaultPerson);
        // либо мы можем функционал создания нового Persone сразу заложить в orElse
        Person person = personRepository.findById("id1").orElse(new Person());
//        System.out.println(person);

        Person person1 = personRepository.findById("id")
                .orElseGet(() -> Person.builder()   // тут мы можем использовать Person.builder() так как в классе
                                                    // Persone у нас есть такая анотация, иначе это было бы
                                                    // .orElseGet(() -> new Persone())
                        .name("Default")
                        .salary(100000)
                        .age(12)
                        .build());
//        System.out.println(person1);

        String id = "id1";
        String name = personRepository.findById(id)
                .map(Person::getName)
                .orElseThrow(() -> new NoPersonException(id));
//
        System.out.println(name);
    }
}
