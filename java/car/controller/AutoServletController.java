package car.controller;

import java.io.*;
import java.util.List;

import car.dao.AutoDaoImplement;
import car.idao.IAutoDAO;
import car.model.Auto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "servletController", value = "/servletController")
public class AutoServletController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World by Anyel EC";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /*
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

        List<Auto> listaAutos = oAutoDAO.get();
        request.setAttribute("autos", listaAutos);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);*/
        String opcion = request.getParameter("opcion");
        if (opcion.equals("registro")){
            RequestDispatcher rd = request.getRequestDispatcher("crear.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IAutoDAO oAutoDao  =new AutoDaoImplement();
        String opcion= req.getParameter("opcion");
        if(opcion.equals("crear")){
            Auto oAuto = new Auto();
            oAuto.setMarca(req.getParameter("marca"));
            oAuto.setPlaca(req.getParameter("placa"));
            oAuto.setModelo(req.getParameter("modelo"));

            oAutoDao.add(oAuto);
            List<Auto> listaAutos = oAutoDao.get();
            req.setAttribute("autos", listaAutos);

            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }
    }

    public void destroy() {
    }
}