package FormacionBackend5.InyeccionDeDependencias.Cities;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CityService {

    public void addCity(String name, int inhabitants);

    public List<City> getCities();
}
