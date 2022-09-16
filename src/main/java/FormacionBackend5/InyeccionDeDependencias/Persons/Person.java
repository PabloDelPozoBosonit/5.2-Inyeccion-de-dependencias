package FormacionBackend5.InyeccionDeDependencias.Persons;

import lombok.Data;

@Data
public class Person {
    String name,
            city;
    int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
}
