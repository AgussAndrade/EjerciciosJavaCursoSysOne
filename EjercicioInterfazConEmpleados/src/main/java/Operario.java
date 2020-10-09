public class Operario implements Empleado{
    public double sueldoMin;
    public int antiguedad;
    public double dni;
    public int legajo;
    public String nombreYApellido;
    public int anioDeNacimiento;
    int porcentajeAsistencia;
    Operario(int antiguedad, double dni, int legajo, String nombreYApellido, int anioDeNacimiento,int porcentajeAsistencia){
        this.antiguedad =antiguedad;
        this.dni = dni;
        this.legajo = legajo;
        this.nombreYApellido = nombreYApellido;
        this.anioDeNacimiento = anioDeNacimiento;
        this.porcentajeAsistencia = porcentajeAsistencia;
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
    @Override
    public int calcularEdad(int anioActual){
        return (anioActual - anioDeNacimiento);
    }

    @Override
    public double calcularSueldo() {
        if(antiguedad <= 5 && antiguedad > 3){
            sueldoMin = 5000;
        }
        else if (antiguedad >= 5) {
            sueldoMin = 10000;
        }
        else if(porcentajeAsistencia == 100){
            sueldoMin = 30000;
        }
        else if(porcentajeAsistencia >= 85){
            sueldoMin =15000;
        }

        return sueldoMin;
    }
}
