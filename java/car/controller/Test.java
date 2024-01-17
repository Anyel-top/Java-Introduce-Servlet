package car.controller;

import car.dao.AutoDaoImplement;
import car.idao.IAutoDAO;
import car.model.Auto;

public class Test {
    public static void main(String[] args){
        Auto auto1 = new Auto();
        auto1.setPlaca("123");
        auto1.setMarca("Toyota");
        auto1.setModelo("Rio");
        auto1.setAnio("2016");
        auto1.setCilindraje("2000");
        auto1.setConsumo("40kms por galon");

        Auto auto2 = new Auto();
        auto2.setPlaca("333");
        auto2.setMarca("Mercedes");
        auto2.setModelo("Rio");
        auto2.setAnio("2016");
        auto2.setCilindraje("2000");
        auto2.setConsumo("10kms por galon");

        Auto auto3 = new Auto();
        auto3.setPlaca("444");
        auto3.setMarca("Kia");
        auto3.setModelo("Rio");
        auto3.setAnio("2016");
        auto3.setCilindraje("2000");
        auto3.setConsumo("68kms por galon");

        IAutoDAO oAutoDAO = new AutoDaoImplement();
        oAutoDAO.add(auto1);
        oAutoDAO.add(auto2);
        oAutoDAO.add(auto3);

        for (Auto auto: oAutoDAO.get()){
            System.out.println(auto);
        }
    }
}
