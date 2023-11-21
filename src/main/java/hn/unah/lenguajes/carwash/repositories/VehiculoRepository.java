package hn.unah.lenguajes.carwash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.carwash.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer>{
    
}
