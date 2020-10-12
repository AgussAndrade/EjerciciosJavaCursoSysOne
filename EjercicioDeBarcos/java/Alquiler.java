import java.util.Date;

public class Alquiler {
    private String nombre;
    private double dni;
    private int[] fechaDeInicio;
    private int[] fechaDeTermino;
    private Barco barco;
    private int factorFijo = 2;
    public Alquiler(String nombre, double dni , int[] fechaDeInicio, int[] fechaDeTermino, Barco barco){
        this.barco = barco;
        this.nombre = nombre;
        this. fechaDeInicio = fechaDeInicio;
        this.fechaDeTermino = fechaDeTermino;
        this.dni = dni;
    }
    public int calcularPresupuesto(){
        int diasAMultiplicar = fechaDeTermino[2] - fechaDeInicio[2];
        int factorDelBarco = barco.moduloFuncionParaAlquiler();
        return diasAMultiplicar * factorDelBarco * factorFijo;
    }
    public void cambiarFactorFijo( int factorFijo){
        this.factorFijo = factorFijo;
    }
    public int getMes(){
        return fechaDeInicio[1];
    }
}
