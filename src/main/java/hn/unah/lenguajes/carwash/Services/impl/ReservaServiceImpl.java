package hn.unah.lenguajes.carwash.Services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.carwash.CreateReservaDTO;
import hn.unah.lenguajes.carwash.Services.ReservaService;
import hn.unah.lenguajes.carwash.models.Reserva;
import hn.unah.lenguajes.carwash.models.Vehiculo;
import hn.unah.lenguajes.carwash.repositories.ReservaRepository;
import hn.unah.lenguajes.carwash.repositories.VehiculoRepository;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public String crearReserva(CreateReservaDTO datos) {
        
        if (this.vehiculoRepository.findById(datos.getIdVehiculo()).get().isDisponible()) {
            Vehiculo vehiculo = this.vehiculoRepository.findById(datos.getIdVehiculo()).get();
            vehiculo.setDisponible(false);
            this.vehiculoRepository.save(vehiculo);

            Reserva reserva = new Reserva();
            reserva.setIdCliente(datos.getIdCliente());
            reserva.setIdVehiculo(datos.getIdVehiculo());
            reserva.setDias(datos.getDias());

            Date date = new Date();

            reserva.setFecha(date);
            reserva.setTotal(vehiculo.getTipoVehiculo().getPrecioXHora() * 24 * datos.getDias());

            this.reservaRepository.save(reserva);
            return "Reserva hecha";
        }

        return "El vehiculo esta ocupado";
    }
    
}
