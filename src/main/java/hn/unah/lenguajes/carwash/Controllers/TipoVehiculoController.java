package hn.unah.lenguajes.carwash.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.carwash.Services.impl.TipoVehiculoServiceImpl;
import hn.unah.lenguajes.carwash.models.TipoVehiculo;

@RestController
@RequestMapping("/api/carwash/tipovehiculo")
public class TipoVehiculoController {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/guardar")
    public TipoVehiculo guardar(@RequestBody TipoVehiculo tipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

}
