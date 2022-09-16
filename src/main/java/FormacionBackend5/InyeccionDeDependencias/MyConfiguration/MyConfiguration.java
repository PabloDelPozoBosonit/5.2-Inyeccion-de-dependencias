package FormacionBackend5.InyeccionDeDependencias.MyConfiguration;

import FormacionBackend5.InyeccionDeDependencias.Cities.City;
import FormacionBackend5.InyeccionDeDependencias.Persons.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfiguration {


    @Bean
    public List<Person> createPersonList() {

        return new ArrayList<Person>();
    }

    @Bean
    public List<City> createCitiesList() {

        return new ArrayList<City>();
    }
}
