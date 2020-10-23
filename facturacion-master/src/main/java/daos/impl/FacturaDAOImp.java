package daos.impl;

import daos.ClienteDAO;
import daos.FacturaDAO;
import model.Factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FacturaDAOImp implements FacturaDAO {


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
    public void insert(Factura factura) {
        Connection conn = this.getConnection();



        try{

            String consulta="insert into factura (id_cliente, fecha, precio) values(" +
                    factura.getCliente().getId() + ","  +
                    factura.getFechaFactura() + "," +
                    factura.calcularFactura() + ")";

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }



    }

    public void update(Factura factura) {
        Connection conn = this.getConnection();

        try{

            String consulta=  "update  factura set id_cliente = " + factura.getCliente().getId() +
                    "set fecha =  " + factura.getFechaFactura() +
                    "set precio =  " + factura.calcularFactura() +
                    " where id = " + factura.getIdFactura() ;

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

            String consulta=  "delete * from factura where id = " + id ;

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);
        }
    }

    public Factura queryId(Integer id) {

        Connection conn = this.getConnection();
        Factura factura = new Factura() ;

        try{

            String consulta=  "select *  from factura  where id = " + id ;

            Statement sentencia = conn.createStatement();
            sentencia.execute(consulta);

            ResultSet rs = sentencia.getResultSet();

            if(rs.next()){

                factura.setIdFactura(rs.getInt("id"));
                factura.setFechaFactura(rs.getDate("fecha"));
                ClienteDAO clienteDao = new ClienteDAOImp();
                factura.setCliente(clienteDao.queryId(rs.getInt("id_cliente")) );
            }


        }catch (Exception ex){

            ex.printStackTrace();
        }finally {

            closeConnection(conn);

            return factura;
        }

    }
}
