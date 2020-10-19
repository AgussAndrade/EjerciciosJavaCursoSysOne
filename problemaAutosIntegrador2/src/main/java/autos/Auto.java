package autos;

import adicionales.Adicional;

import java.util.ArrayList;
import java.util.List;

public abstract class Auto {
    protected double precioBase;
    protected List<Adicional> adicionales;
    public Auto (){
        adicionales = new ArrayList<Adicional>();
    }
    public void addAdicional(Adicional adicional){
        adicionales.add(adicional);
    }
    public double calcularValor(){
        double toReturn =0;
        for(Adicional adicional : adicionales){
            toReturn += adicional.calcularImporte();
        }
        toReturn += getPrecioBase();
        return toReturn;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
