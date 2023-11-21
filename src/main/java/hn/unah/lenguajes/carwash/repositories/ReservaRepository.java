package hn.unah.lenguajes.carwash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.carwash.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
}
