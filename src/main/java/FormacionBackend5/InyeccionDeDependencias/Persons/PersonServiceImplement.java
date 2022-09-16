package FormacionBackend5.InyeccionDeDependencias.Persons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImplement implements PersonService{
    @Autowired
    @Qualifier("createPersonList")
    List<Person> peoples;

    @Override
    public void addPerson(String name, String city, int age) {

        Person p = new Person(name, city, age);
        peoples.add(p);

    }

    @Override
    public List<Person> getPersons() {
        return peoples;
    }
}
