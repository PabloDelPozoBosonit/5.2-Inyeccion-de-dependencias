package FormacionBackend5.InyeccionDeDependencias.Cities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class CityServiceImplement implements  CityService {

    @Autowired
    @Qualifier("createCitiesList")
    List<City> cities;

    @Override
    public void addCity(String name, int inhabitants) {

        City c = new City(name, inhabitants);
        cities.add(c);
    }


    @Override
    public List<City> getCities() {
        return cities;
    }
}
