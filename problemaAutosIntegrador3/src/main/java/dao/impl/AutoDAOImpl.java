package dao.impl;

import dao.AdicionalDAO;
import dao.AutoDAO;
import model.adicionales.*;
import model.autos.Auto;
import model.autos.Coupe;
import model.autos.Familiar;
import model.autos.Sedan;

import java.sql.ResultSet;
import java.util.List;

public class AutoDAOImpl implements AutoDAO {
    SQLManager sqlManager;
    AdicionalDAO adicionalDAO;
    public AutoDAOImpl(){
        adicionalDAO = new AdicionalDAOImpl();
        sqlManager = new SQLManager();
    }
    @Override
    public void insert(Auto object) {

        String query ="insert into Auto (modelo,precio_base,precio_total) values(" +
                        object.getClass().getSimpleName() + "," +
                        object.getPrecioBase() + "," +
                        object.calcularValor() + ")";
        ResultSet keys  = sqlManager.executeWithGeneratedKeys(query);
        int id =0;

        try {

            if (keys.next()) {
                id = keys.getInt(1);
            }

        }
        catch (Exception e){

            e.printStackTrace();
        }

        List<Adicional> adicionals = object.getAdicionales();
        for(Adicional a : adicionals){
            adicionalDAO.insert( a ,id);
        }
    }

    @Override
    public void update(Auto object) {

        String query ="update Auto set modelo ="+
                        object.getClass().getSimpleName() + "," +
                        "set precio_base = " + object.getPrecioBase() + "," +
                        "set precio_total = " + object.calcularValor() +
                        "where id = " + object.getId();

        sqlManager.execute(query);
    }

    @Override
    public void delete(Integer id) {
        String queryAdicional = "delete * from adicional where id_auto =" + id;
        String queryAuto = "delete * from auto where id = " + id;
        sqlManager.execute(queryAdicional);
        sqlManager.execute(queryAuto);
    }

    @Override
    public Auto queryId(Integer id) {
        String query = "select * from auto where id=" + id;
        ResultSet rs = sqlManager.executeQuery(query);
        Auto auto = null;
        try{
            if(rs.next()){
                auto = getAuto(rs.getString("modelo")) ;
                auto.setId(rs.getInt("id"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        String query_adicional = "select * from adicional where id_auto =" + id;
        ResultSet resultSet = sqlManager.executeQuery(query_adicional);
        try{
            while(rs.next()){
                auto.addAdicional(adicionalDAO.queryId(resultSet.getInt("id")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return auto;
    }

    private Auto getAuto(String nameOfClass) {
        if(nameOfClass.equals("Coupe")){
            return new Coupe();
        }
        else if(nameOfClass.equals("Familiar")){
            return new Familiar();
        }
        return new Sedan();
    }
}
