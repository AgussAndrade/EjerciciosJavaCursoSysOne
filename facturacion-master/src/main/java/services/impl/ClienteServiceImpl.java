package services.impl;

import daos.ClienteDAO;
import daos.impl.ClienteDAOImp;
import dtos.ClienteDTO;
import dtos.FacturaDTO;
import model.Cliente;
import model.Factura;
import services.ClienteService;

public class ClienteServiceImpl implements ClienteService {
    private ClienteDAO clienteDAO = new ClienteDAOImp();

    public void ingresarCliente(ClienteDTO clienteDTO) {

        clienteDAO.insert(converter(clienteDTO));

    }

    public ClienteDTO consultarCliente(int clienteId) {

        return converter( clienteDAO.queryId( clienteId ) );

    }


    private Cliente converter(ClienteDTO clienteDTO){

        Cliente cliente = new Cliente();
        cliente.setApellido(clienteDTO.getApellido());
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setId(clienteDTO.getId());
        return cliente;

    }
    private ClienteDTO converter(Cliente cliente){

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setApellido(cliente.getApellido());
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNombre(cliente.getNombre());

        return clienteDTO;

    }
}
