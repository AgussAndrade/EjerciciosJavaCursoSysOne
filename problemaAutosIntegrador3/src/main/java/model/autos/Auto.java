package model.autos;

import model.adicionales.Adicional;

import java.util.ArrayList;
import java.util.List;

public abstract class Auto {
    protected double precioBase;
    private List<Adicional> adicionales;
    private Integer id;
    public Auto (){
        setAdicionales(new ArrayList<Adicional>());
    }
    public void addAdicional(Adicional adicional){
        getAdicionales().add(adicional);
    }
    public double calcularValor(){
        double toReturn =0;
        for(Adicional adicional : getAdicionales()){
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(List<Adicional> adicionales) {
        this.adicionales = adicionales;
    }
}
