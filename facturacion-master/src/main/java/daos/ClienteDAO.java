package daos;

import model.Articulo;
import model.Cliente;

public interface ClienteDAO {
    public void insert(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(Integer id);
    public Cliente queryId(Integer id);
}
