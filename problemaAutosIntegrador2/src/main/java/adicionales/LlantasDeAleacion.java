package adicionales;

public class LlantasDeAleacion implements Adicional{
    private double precioBase;
    public LlantasDeAleacion(){
        precioBase = 12000;
    }
    @Override
    public double calcularImporte() {
        return precioBase;
    }
}
