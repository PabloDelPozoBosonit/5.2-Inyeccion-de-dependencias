package FormacionBackend5.InyeccionDeDependencias.Controllers;

import FormacionBackend5.InyeccionDeDependencias.Cities.City;
import FormacionBackend5.InyeccionDeDependencias.Cities.CityService;
import FormacionBackend5.InyeccionDeDependencias.Persons.Person;
import FormacionBackend5.InyeccionDeDependencias.Persons.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller2 {
    @Autowired
    PersonService personService;

    @Autowired
    CityService cityService;


    //Cuando se llama a este metodo, llamamos a getPersons() para que nos los muestre, ademas las imprimimos por la consola
    @GetMapping("controller2/getPersons")
    public List<Person> getPersons() {

        //System.out.println(personService.getPersons());
        return personService.getPersons();
    }


    //Cuando se llama a este metodo, llamamos a getCities() para que nos los muestre, ademñas las imprimimos por la consola
    @GetMapping("controller2/getCities")
    public List<City> getCities() {

        //System.out.println(cityService.getCities());
        return cityService.getCities();

    }


    //Estos tres metodos retornan el primer, segundo y tercer Person, respectivamente, primero deben estar creados y añadidos en List
    @GetMapping("controller2/bean/1")
    public Person getPerson1() {

        return personService.getPersons().get(0);
    }

    @GetMapping("controller2/bean/2")
    public Person getPerson2() {

        return personService.getPersons().get(1);
    }

    @GetMapping("controller2/bean/3")
    public Person getPerson3() {

        return personService.getPersons().get(2);
    }
}
