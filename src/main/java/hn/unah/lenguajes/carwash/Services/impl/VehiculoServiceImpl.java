package hn.unah.lenguajes.carwash.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.carwash.CreateVehiculoDTO;
import hn.unah.lenguajes.carwash.Services.VehiculoService;
import hn.unah.lenguajes.carwash.models.Vehiculo;
import hn.unah.lenguajes.carwash.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes.carwash.repositories.VehiculoRepository;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(CreateVehiculoDTO vehiculo) {
        Vehiculo nvoVehiculo = new Vehiculo();
        nvoVehiculo.setMarca(vehiculo.getMarca());
        nvoVehiculo.setAnio(vehiculo.getAnio());
        nvoVehiculo.setDisponible(vehiculo.isDisponible());
        nvoVehiculo.setTipoVehiculo(this.tipoVehiculoRepository.findById(vehiculo.getIdtipovehiculo()).get());
        return this.vehiculoRepository.save(nvoVehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculo(int id) {
        boolean estaVehiculo = this.vehiculoRepository.findById(id).isPresent();

        if (estaVehiculo) {
            return this.vehiculoRepository.findById(id).get();
        }
        
        return null;
    }
    
}
