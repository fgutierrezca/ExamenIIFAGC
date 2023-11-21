package hn.unah.lenguajes.carwash.Services;

import java.util.List;

import hn.unah.lenguajes.carwash.CreateClienteDTO;
import hn.unah.lenguajes.carwash.models.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(CreateClienteDTO cliente);

    public List<Cliente> obtenerTodos();

    public Cliente obtenerCliente(int id);

}
