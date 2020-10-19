package adicionales;

public class AireAcondicionado implements Adicional {
    private double precioBase;

    public AireAcondicionado(){
        this.precioBase =20000;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double calcularImporte() {

        return precioBase;
    }
}
