package dao;

import model.adicionales.Adicional;

public interface AdicionalDAO  {
    public void insert(Adicional object,int id_auto);
    public void update(Adicional object,int id_auto);
    public void delete(Integer id);
    public Adicional queryId(Integer id);
}
