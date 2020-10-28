package dao.impl;

import model.adicionales.*;
import dao.AdicionalDAO;

import java.sql.ResultSet;

public class AdicionalDAOImpl implements AdicionalDAO {
    SQLManager sqlManager;
    public AdicionalDAOImpl(){
        sqlManager = new SQLManager();
    }
    @Override
    public void insert(Adicional object,int id_auto) {
        String query = "insert into adicional (tipo,precio,id_auto) values (" +
                                                object.getClass().getSimpleName() + ","
                                                + object.calcularImporte() +
                                                + id_auto +")";
        sqlManager.execute(query);
    }

    @Override
    public void update(Adicional object,int id_auto) {
        String query = "update adicional set id_auto ="+ id_auto
                        + " set tipo = " + object.getClass().getSimpleName() +
                        ", set precio = " + object.calcularImporte()
                        + "where id = " +  object.getId();

        sqlManager.execute(query);
    }

    @Override
    public void delete(Integer id) {
        String query = "delete * from adicional where id =" + id;
        sqlManager.execute(query);
    }

    @Override
    public Adicional queryId(Integer id) {
        String query = "select * from adicional where id=" + id;
        ResultSet rs = sqlManager.executeQuery(query);
        Adicional adicional = null;
        try{
            if(rs.next()){
                adicional = getAdicional(rs.getString("tipo")) ;
                adicional.setId(rs.getInt("id"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return adicional;
    }




    private Adicional getAdicional(String nameOfClass){
        if(nameOfClass.equals("Airbag")){
            return new Airbag();
        }
        else if(nameOfClass.equals("AireAcondicionado")){
            return new AireAcondicionado();
        }
        else if (nameOfClass.equals("LlantasDeAleacion")){
            return new LlantasDeAleacion();
        }
        else if (nameOfClass.equals("SistemaDeFrenos")){
            return new SistemaDeFrenos();
        }
        return new TechoCorredizo();
    }
}
