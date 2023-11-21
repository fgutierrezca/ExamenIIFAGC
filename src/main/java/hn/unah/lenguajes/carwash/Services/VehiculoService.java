package hn.unah.lenguajes.carwash.Services;

import java.util.List;

import hn.unah.lenguajes.carwash.CreateVehiculoDTO;
import hn.unah.lenguajes.carwash.models.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo(CreateVehiculoDTO vehiculo);
    
    public List<Vehiculo> obtenerTodos();

    public Vehiculo obtenerVehiculo(int id);
}
