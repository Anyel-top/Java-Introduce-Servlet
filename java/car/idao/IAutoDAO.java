package car.idao;

import car.model.Auto;

import java.util.List;

public interface IAutoDAO {
    void add(Auto auto);
    void update (Auto auto);
    List<Auto> get();
    Auto getAuto(String placa);
    void detele (String placa);
}
