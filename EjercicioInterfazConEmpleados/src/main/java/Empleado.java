public interface Empleado {
//    protected double sueldoMin;
//    protected int antiguedad;
//    protected double dni;
//    protected int legajo;
//    protected String nombreYApellido;
//    protected int anioDeNacimiento;
//    Empleado(int antiguedad, double dni, int legajo, String nombreYApellido, int anioDeNacimiento){
//        this.antiguedad =antiguedad;
//        this.dni = dni;
//        this.legajo = legajo;
//        this.nombreYApellido = nombreYApellido;
//        this.anioDeNacimiento = anioDeNacimiento;
//    }
    public double calcularSueldo();
//    {
//        if(antiguedad <= 5 && antiguedad > 3){
//            sueldoMin = 5000;
//        }
//        else if (antiguedad >= 5){
//            sueldoMin = 10000;
//        }
//        return sueldoMin;
//    }
    public int calcularEdad(int anioActual);

    String nombreYApellido();

    double dni();

    int legajo();
//    {
//        return (anioActual - anioDeNacimiento);
//    }
}
