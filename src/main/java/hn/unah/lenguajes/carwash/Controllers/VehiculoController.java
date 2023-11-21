package hn.unah.lenguajes.carwash.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.carwash.CreateVehiculoDTO;
import hn.unah.lenguajes.carwash.Services.impl.VehiculoServiceImpl;
import hn.unah.lenguajes.carwash.models.Vehiculo;

@RestController
@RequestMapping("/api/carwash/vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/guardar")
    public Vehiculo guardar(@RequestBody CreateVehiculoDTO vehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/todos")
    public List<Vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodos();
    }

    @GetMapping("/obtener")
    public Vehiculo obtenerVehiculo(@RequestParam(name = "id") int id){
        return this.vehiculoServiceImpl.obtenerVehiculo(id);
    }
}
