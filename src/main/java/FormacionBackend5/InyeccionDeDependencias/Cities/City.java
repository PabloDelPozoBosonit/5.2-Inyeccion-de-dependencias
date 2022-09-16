package FormacionBackend5.InyeccionDeDependencias.Cities;

import lombok.Data;

@Data
public class City {
    String name;
    int numberInhabitants;

    public City(String name, int numberInhabitants) {
        this.name = name;
        this.numberInhabitants = numberInhabitants;
    }
}
