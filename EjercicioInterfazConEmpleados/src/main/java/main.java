import java.util.ArrayList;
import java.util.List;

public class main {
    private static int anioActual = 2020;
    public static void main(String[] args){
        Empleado administrativo = new Administrativo(4,1542415,1502,"pepe",1999);
        Empleado operario = new Operario( 10,154236,134,"Juan",1999,87);
        Empleado programador = new Programador(3,134697,1674,"Diego",1999);
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoList.add(administrativo);
        empleadoList.add(operario);
        empleadoList.add(programador);
        for(Empleado empleado : empleadoList){
            System.out.println("Esta linea es distinta");
            System.out.println("Empleado: " + empleado.nombreYApellido() + ",dni: "+ empleado.dni() +",legajo:" + empleado.legajo() + ",sueldo: " + empleado.calcularSueldo() + ", edad:" + empleado.calcularEdad(anioActual));
        }
    }
}
