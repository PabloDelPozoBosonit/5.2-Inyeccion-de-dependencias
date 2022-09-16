package FormacionBackend5.InyeccionDeDependencias.Persons;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    public void addPerson(String name, String city, int age);


    public List<Person> getPersons();

}