package car.model;

public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private String cilindraje;
    private String anio;
    private String consumo;

    public Auto() {
    }

    public Auto(String placa, String marca, String modelo, String cilindraje, String anio, String consumo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.anio = anio;
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", anio='" + anio + '\'' +
                ", consumo='" + consumo + '\'' +
                '}';
    }
}
