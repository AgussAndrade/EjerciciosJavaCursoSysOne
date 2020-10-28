package model.adicionales;

public class Airbag implements Adicional {
    private double precioBase;
    private Integer id;
    public Airbag(){
        precioBase = 7000;
    }
    @Override
    public double calcularImporte() {

        return getPrecioBase();
    }

    public double getPrecioBase() {
        return precioBase;
    }
    // Esta hecho mas que nada para posibles casos de cambio de contrato

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
