package adicionales;

public class TechoCorredizo implements Adicional {
    private double precioBase;
    public TechoCorredizo(){
        precioBase = 12000;
    }

    @Override
    public double calcularImporte() {
        return precioBase;
    }
}
