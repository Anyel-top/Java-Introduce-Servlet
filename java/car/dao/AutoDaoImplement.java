package car.dao;

import car.idao.IAutoDAO;
import car.model.Auto;
import car.util.MemoryStore;

import java.util.List;

public class AutoDaoImplement implements IAutoDAO {

    @Override
    public void add(Auto auto) {
        MemoryStore.addAuto(auto);
    }

    @Override
    public void update(Auto auto) {
        MemoryStore.editAuto(auto);

    }

    @Override
    public List<Auto> get() {
        return MemoryStore.getAutos();
    }

    @Override
    public Auto getAuto(String placa) {
        return MemoryStore.getAuto(placa);
    }
}
