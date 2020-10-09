public class Programador implements Empleado{
    public double sueldoMin;
    public int antiguedad;
    public double dni;
    public int legajo;
    public String nombreYApellido;
    public int anioDeNacimiento;
    boolean cumpleFuncionalidades;
    Programador(int antiguedad, double dni, int legajo, String nombreYApellido, int anioDeNacimiento){
        this.antiguedad =antiguedad;
        this.dni = dni;
        this.legajo = legajo;
        this.nombreYApellido = nombreYApellido;
        this.anioDeNacimiento = anioDeNacimiento;
        cumpleFuncionalidades =false;
    }

    @Override
    public double calcularSueldo() {
        if(antiguedad <= 5 && antiguedad > 3){
            sueldoMin = 5000;
        }
        else if (antiguedad >= 5) {
            sueldoMin = 10000;
        }
        else if(cumpleFuncionalidades){
            sueldoMin =30000;
        }
        return sueldoMin;
    }

    @Override
    public int calcularEdad(int anioActual) {
        return (anioActual - anioDeNacimiento);
    }
    @Override
    public String nombreYApellido() {
        return nombreYApellido;
    }

    @Override
    public double dni() {
        return dni;
    }

    @Override
    public int legajo() {
        return legajo;
    }
    public void cumplirFuncionalidades(){
        this.cumpleFuncionalidades =true;
    }
}
