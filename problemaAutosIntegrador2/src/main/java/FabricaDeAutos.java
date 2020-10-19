import adicionales.*;
import autos.Auto;
import autos.Coupe;
import autos.Familiar;
import autos.Sedan;

public class FabricaDeAutos {

    private Auto autoOnBuilding;
    public FabricaDeAutos(){

        autoOnBuilding = null;

    }

    public void comenzarFabricacionDeCoupe(){

        this.autoOnBuilding = new Coupe();

    }


    public void comenzarFabricacionDeFamiliar(){

        this.autoOnBuilding = new Familiar();

    }

    public void comenzarFabricacionDeSedan(){

        this.autoOnBuilding = new Sedan();

    }

    public void addAirbag() throws NoComenzoLaFabricacionException {

        if(autoOnBuilding ==(null)){
            throw new NoComenzoLaFabricacionException();
        }

        this.autoOnBuilding.addAdicional(new Airbag());

    }

    public void addAireAcondicionado() throws NoComenzoLaFabricacionException {

        if(autoOnBuilding == (null)){
            throw new NoComenzoLaFabricacionException();
        }

        this.autoOnBuilding.addAdicional(new AireAcondicionado());

    }
    public void addLlantasAleacion() throws NoComenzoLaFabricacionException {

        if(autoOnBuilding == (null)){
            throw new NoComenzoLaFabricacionException();
        }

        this.autoOnBuilding.addAdicional(new LlantasDeAleacion());

    }

    public void addSistemaDeFrenos() throws NoComenzoLaFabricacionException {

        if(autoOnBuilding == (null)){
            throw new NoComenzoLaFabricacionException();
        }

        this.autoOnBuilding.addAdicional(new SistemaDeFrenos());
    }

    public void addTechoCorredizo() throws NoComenzoLaFabricacionException {

        if(autoOnBuilding == (null)){
            throw new NoComenzoLaFabricacionException();
        }

        this.autoOnBuilding.addAdicional(new TechoCorredizo());

    }
    public Auto terminarFabricacion() throws NoComenzoLaFabricacionException {
        if(autoOnBuilding == null){
            throw new NoComenzoLaFabricacionException();
        }
        Auto toReturn = this.autoOnBuilding;
        this.autoOnBuilding = null;
        return toReturn;
    }
}
