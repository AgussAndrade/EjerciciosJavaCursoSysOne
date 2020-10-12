import java.util.ArrayList;

public class AdministradorDeAlquileres {
    private ArrayList<Alquiler> alquilers;
    public AdministradorDeAlquileres(){
        alquilers = new ArrayList<>();
    }
    public void agregarAlquiler(Alquiler alquiler){
        alquilers.add(alquiler);
    }
    public Alquiler getMayorAlquiler(){
        Alquiler aDevolver = alquilers.get(0);
        for (Alquiler alquiler: alquilers) {

            if(aDevolver.calcularPresupuesto() < alquiler.calcularPresupuesto()){
                aDevolver = alquiler;
            }
        }
        return aDevolver;
    }
    public Alquiler getMenorAlquiler(){
        Alquiler aDevolver = alquilers.get(0);
        for (Alquiler alquiler: alquilers) {

            if(aDevolver.calcularPresupuesto() > alquiler.calcularPresupuesto()){
                aDevolver = alquiler;
            }
        }
        return aDevolver;
    }
    public int calcularPromedioParaMes(int mes){
        int alquileres = 0;
        int contadorDeAlquileres = 0;
        for (Alquiler alquiler : alquilers){
            if(alquiler.getMes() == mes){
                alquileres+= alquiler.calcularPresupuesto();
                contadorDeAlquileres +=1;
            }
        }
        if(contadorDeAlquileres == 0){
            return 0;
        }
        return (alquileres / contadorDeAlquileres);
    }
    public int calcularPromedioParaAnio(){
        int alquileres = 0;
        int contadorDeAlquileres = 0;
        for (Alquiler alquiler : alquilers){
            alquileres+= alquiler.calcularPresupuesto();
            contadorDeAlquileres +=1;
        }
        return (alquileres / contadorDeAlquileres);
    }
}
