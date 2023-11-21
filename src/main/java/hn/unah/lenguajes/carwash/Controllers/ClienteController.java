package hn.unah.lenguajes.carwash.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.carwash.CreateClienteDTO;
import hn.unah.lenguajes.carwash.Services.impl.ClienteServiceImpl;
import hn.unah.lenguajes.carwash.models.Cliente;

@RestController
@RequestMapping("/api/carwash/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente guardar(@RequestBody CreateClienteDTO cliente){
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtener")
    public Cliente obtenerCliente(@RequestParam(name = "id") int id){
        return this.clienteServiceImpl.obtenerCliente(id);
    }
    
}
