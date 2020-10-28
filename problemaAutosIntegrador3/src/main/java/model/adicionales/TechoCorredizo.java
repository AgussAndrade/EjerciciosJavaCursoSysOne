package model.adicionales;

public class TechoCorredizo implements Adicional {
    private double precioBase;
    private Integer id;
    public TechoCorredizo(){
        precioBase = 12000;
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
