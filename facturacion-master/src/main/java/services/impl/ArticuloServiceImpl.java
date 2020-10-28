package services.impl;

import daos.ArticuloDAO;
import daos.impl.ArticuloDAOImp;
import dtos.ArticuloDTO;

import model.Articulo;
import services.ArticuloService;

public class ArticuloServiceImpl implements ArticuloService {
    private ArticuloDAO articuloDAO;
    public ArticuloServiceImpl(){
        articuloDAO = new ArticuloDAOImp();
    }
    public void ingresarCliente(ArticuloDTO articuloDTO) {
        articuloDAO.insert(converter(articuloDTO));
    }

    public ArticuloDTO consultarCliente(int articuloId) {
        return converter(articuloDAO.queryId(articuloId));
    }
    private Articulo converter (ArticuloDTO articuloDTO){

        Articulo ar = new Articulo();
        ar.setPrecio(articuloDTO.getPrecio());
        ar.setIdArticulo(articuloDTO.getIdArticulo());
        ar.setDescripcion(articuloDTO.getDescripcion());
        return ar;

    }
    private ArticuloDTO converter(Articulo articulo){
        ArticuloDTO ar = new ArticuloDTO();
        ar.setPrecio(articulo.getPrecio());
        ar.setIdArticulo(articulo.getIdArticulo());
        ar.setDescripcion(articulo.getDescripcion());
        return ar;
    }
}
