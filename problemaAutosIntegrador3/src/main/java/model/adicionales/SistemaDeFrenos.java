package model.adicionales;

public class SistemaDeFrenos implements Adicional{
    private double precioBase;
    private Integer id;
    public SistemaDeFrenos(){
        precioBase = 14000;
    }

    @Override
    public double calcularImporte() {
        return precioBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
