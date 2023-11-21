package hn.unah.lenguajes.carwash.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.carwash.Services.TipoVehiculoService;
import hn.unah.lenguajes.carwash.models.TipoVehiculo;
import hn.unah.lenguajes.carwash.repositories.TipoVehiculoRepository;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
