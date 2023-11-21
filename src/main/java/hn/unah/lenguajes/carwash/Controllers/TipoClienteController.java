package hn.unah.lenguajes.carwash.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.carwash.Services.impl.TipoClienteServiceImpl;
import hn.unah.lenguajes.carwash.models.TipoCliente;

@RestController
@RequestMapping("/api/carwash/tipocliente")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/guardar")
    public TipoCliente guardar(@RequestParam(name = "descripcion") String descripcion){
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }

}
