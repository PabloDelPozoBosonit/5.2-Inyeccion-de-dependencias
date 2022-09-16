package FormacionBackend5.InyeccionDeDependencias.Controllers;

import FormacionBackend5.InyeccionDeDependencias.Cities.CityService;
import FormacionBackend5.InyeccionDeDependencias.Persons.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Autowired
    PersonService personService;

    @Autowired
    CityService cityService;


    //Este metodo recibe por GET, parametros en el header y con ellos, llama al metodo addPersona
    //Además muestra que esa persona ha sido añadida, para comprobar su llamada

    @GetMapping("controller1/addPerson")
    public void addPerson(@RequestHeader String name, @RequestHeader String city, @RequestHeader int age) {

        personService.addPerson(name, city, age);
        System.out.println("Persona añadida");
    }


    //Este metodo, por GET y recibiendo los parametros en la ruta, llama al metodo addCity pasandole dichos datos
    //Además muestra que esa ciudad ha sido añadida, para comprobar su llamada

    @GetMapping("/controller1/addCity/{nameCity}/{numberInhabitants}")
    public void addCity(@PathVariable String nameCity, @PathVariable int numberInhabitants) {

        cityService.addCity(nameCity, numberInhabitants);
        System.out.println("Ciudad añadida");

    }
}
