package hn.unah.lenguajes.carwash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.carwash.models.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{
    
}
