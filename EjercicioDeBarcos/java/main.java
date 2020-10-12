import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class main {
    public static String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static void main(String[] args){
        AdministradorDeAlquileres administradorDeAlquileres= new AdministradorDeAlquileres();
        Random random = new Random();
        for(int i = 0; i <=15;i++){
            int mes = random.nextInt(12);
            Barco generico = new Generico("bcdfsd",random.nextInt(40),1940);
            Alquiler alquilerParaGenerico = new Alquiler("Pepe", 152132, new int[]{1999, mes, 4}, new int[]{199, mes, 25}, generico);
            administradorDeAlquileres.agregarAlquiler(alquilerParaGenerico);
        }
        for(int i = 0; i <=10;i++){
            int mes = random.nextInt(12);
            Barco velero = new Velero("bcdfsd",random.nextInt(40),1940, random.nextInt(10));
            Alquiler alquilerParaVelero = new Alquiler("Pepe", 152132, new int[]{1999, mes, 4}, new int[]{199, mes, 25}, velero);
            administradorDeAlquileres.agregarAlquiler(alquilerParaVelero);
        }

        for(int i = 0; i <=5;i++){
            int mes = random.nextInt(12);
            Barco yate = new Yate("bcdfsd",random.nextInt(40),1940, random.nextInt(10));
            Alquiler alquilerParaYate = new Alquiler("Pepe", 152132, new int[]{1999, mes, 4}, new int[]{199, mes, 25}, yate);
            administradorDeAlquileres.agregarAlquiler(alquilerParaYate);
        }

        for(int i = 0; i <=5;i++){
            int mes = random.nextInt(12);
            Barco deportivo = new Deportivo("bcdfsd",random.nextInt(40),1940, random.nextInt(10));
            Alquiler alquilerParaDeportivo = new Alquiler("Pepe", 152132, new int[]{1999, mes, 4}, new int[]{199, mes, 25}, deportivo);
            administradorDeAlquileres.agregarAlquiler(alquilerParaDeportivo);
        }
        System.out.println("Menor alquiler: "+ administradorDeAlquileres.getMenorAlquiler().calcularPresupuesto());
        System.out.println("MayorAlquiler: " + administradorDeAlquileres.getMayorAlquiler().calcularPresupuesto());
        for(int i = 0; i <= 11; i++){
            System.out.println("Promedio para mes " + meses[i] + ": " + administradorDeAlquileres.calcularPromedioParaMes(i));
        }
        System.out.println("Promedio para anio: "+ administradorDeAlquileres.calcularPromedioParaAnio());

    }
}
