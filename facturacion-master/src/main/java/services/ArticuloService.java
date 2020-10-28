package services;

import dtos.ArticuloDTO;

public interface ArticuloService {
    public void ingresarCliente(ArticuloDTO articuloDTO);
    public ArticuloDTO consultarCliente( int articuloId);
}
