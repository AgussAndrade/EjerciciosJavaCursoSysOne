package daos.impl;

import daos.ClienteDAO;
import model.Articulo;
import model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClienteDAOImp implements ClienteDAO {
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

    /**
     *
     * @param conn
     */

    private void closeConnection(Connection conn){

        try {
            conn.close();
        }catch (Exception ex){

            ex.printStackTrace();
        }
    }

    public void insert(Cliente cliente) {
        Connection conn = this.getConnection();



        try{

            String consulta="insert into cliente (nombre, apellido) values(" +
                    cliente.getNombre() + ","  +
                    cliente.getApellido() + ")";

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }


    }

    public void update(Cliente cliente) {
        Connection conn = this.getConnection();

        try{

            String consulta=  "update  cliente set nombre = " + cliente.getNombre() +
                    "set apellido =  " + cliente.getApellido() +
                    " where id = " + cliente.getId() ;

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }


    }

    public void delete(Integer id) {
        Connection conn = this.getConnection();

        try{

            String consulta=  "delete * from cliente where id = " + id ;

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }
    }

    public Cliente queryId(Integer id) {

        Connection conn = this.getConnection();
        Cliente cliente = new Cliente();
        try{

            String consulta=  "select *  from cliente  where id = " + id ;

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

            ResultSet rs = sentencia.getResultSet();

            if(rs.next()){

                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
            }


        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);

            return cliente;
        }

    }
}
