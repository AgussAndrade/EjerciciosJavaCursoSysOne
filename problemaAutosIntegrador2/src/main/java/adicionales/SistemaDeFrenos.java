package adicionales;

public class SistemaDeFrenos implements Adicional{
    private double precioBase;
    public SistemaDeFrenos(){
        precioBase = 14000;
    }

    @Override
    public double calcularImporte() {
        return precioBase;
    }
}
