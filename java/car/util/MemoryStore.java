package car.util;

import car.model.Auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoryStore {
    private static HashMap<String, Auto> autos = new HashMap<String, Auto>();
    // añadir auto
    public static void addAuto(Auto auto){
        String placa = auto.getPlaca();
        if(autos.containsKey(placa)){
            autos.remove(placa);
        }
        autos.put(placa, auto);
    }

    //actualizar
    public static void editAuto(Auto auto){
        autos.replace(auto.getPlaca(), auto);

    }

    // listar los autos
    public static List<Auto> getAutos(){
        return new ArrayList<>(autos.values());
    }

    // listar un auto
    public static Auto getAuto(String placa){
        return autos.get(placa);
    }
}
