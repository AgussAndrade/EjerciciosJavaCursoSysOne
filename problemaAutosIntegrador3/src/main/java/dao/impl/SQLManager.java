package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLManager {
    private Connection getConnection(){

        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/Facturacion";
            String usuario = "root";
            String clave = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, clave);

        }catch (Exception ex){

            ex.printStackTrace();
        }

        return connection;
    }
    private void closeConnection(Connection conn){

        try {
            conn.close();
        }catch (Exception ex){

            ex.printStackTrace();
        }
    }
    public ResultSet executeWithGeneratedKeys(String str){
        Connection conn = this.getConnection();
        ResultSet rs = null;
        try{

            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(str, Statement.RETURN_GENERATED_KEYS );
            rs = sentencia.getGeneratedKeys();

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
            return rs;
        }

    }
    public void execute(String str) {


        Connection conn = this.getConnection();

        try{

            Statement sentencia = conn.createStatement();
            sentencia.execute(str);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }


    }
    public ResultSet executeQuery(String str) {

        Connection conn = this.getConnection();
        ResultSet rs = null;
        try{


            Statement sentencia = conn.createStatement();
            sentencia.execute(str);

            rs = sentencia.getResultSet();

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);

            return rs;
        }

    }
}
