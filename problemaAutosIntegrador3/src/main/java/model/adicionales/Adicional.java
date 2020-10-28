package model.adicionales;

public interface Adicional {
    public double calcularImporte();
    public Integer getId();
    public void setId(Integer id);
    public void setPrecioBase(Integer precioBase);
    public Integer getPrecioBase(Integer precioBase);
}
