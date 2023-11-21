package hn.unah.lenguajes.carwash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.carwash.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
