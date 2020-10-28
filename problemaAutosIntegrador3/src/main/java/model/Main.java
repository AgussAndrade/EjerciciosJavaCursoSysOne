package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/model.autos";
        String usuario = "root";
        String clave = "";
        String consulta ="INSERT INTO auto (id) values (124);";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            Statement sentencia = conexion.createStatement();
            sentencia.execute(consulta);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
