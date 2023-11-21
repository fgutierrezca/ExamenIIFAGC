package hn.unah.lenguajes.carwash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.carwash.models.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer>{
    
}
