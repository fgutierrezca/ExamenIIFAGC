package hn.unah.lenguajes.carwash.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.carwash.Services.TipoClienteService;
import hn.unah.lenguajes.carwash.models.TipoCliente;
import hn.unah.lenguajes.carwash.repositories.TipoClienteRepository;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    
    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(tipoCliente);
    }

}
