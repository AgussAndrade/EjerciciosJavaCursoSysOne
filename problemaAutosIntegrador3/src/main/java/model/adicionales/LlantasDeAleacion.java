package model.adicionales;

public class LlantasDeAleacion implements Adicional{
    private double precioBase;
    private Integer id;
    public LlantasDeAleacion(){
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
