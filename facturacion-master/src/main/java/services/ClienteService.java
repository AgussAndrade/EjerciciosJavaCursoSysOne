package services;


import dtos.ClienteDTO;

public interface ClienteService {
    public void ingresarCliente(ClienteDTO clienteDTO);
    public ClienteDTO consultarCliente( int clienteId);
}
