package hn.unah.lenguajes.carwash.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.carwash.CreateClienteDTO;
import hn.unah.lenguajes.carwash.Services.ClienteService;
import hn.unah.lenguajes.carwash.models.Cliente;
import hn.unah.lenguajes.carwash.repositories.ClienteRepository;
import hn.unah.lenguajes.carwash.repositories.TipoClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crearCliente(CreateClienteDTO cliente) {
        Cliente nvoCliente = new Cliente();
        nvoCliente.setNombre(cliente.getNombre());
        nvoCliente.setApellido(cliente.getApellido());
        nvoCliente.setFechaIngreso(cliente.getFechaIngreso());
        nvoCliente.setTipoCliente(this.tipoClienteRepository.findById(cliente.getIdtipocliente()).get());
        return this.clienteRepository.save(nvoCliente);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerCliente(int id) {
        boolean estaCliente = this.clienteRepository.findById(id).isPresent();

        if (estaCliente) {
            return this.clienteRepository.findById(id).get();
        }

        return null;
    }
    
}
