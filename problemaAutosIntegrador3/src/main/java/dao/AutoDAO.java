package dao;

import model.autos.Auto;

public interface AutoDAO {
    //que este dao use el de los model.adicionales no toques otra cosa
    public void insert(Auto object);
    public void update(Auto object);
    public void delete(Integer id);
    public Auto queryId(Integer id);
}
