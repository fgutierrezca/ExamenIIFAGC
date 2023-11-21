package hn.unah.lenguajes.carwash.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.carwash.CreateReservaDTO;
import hn.unah.lenguajes.carwash.Services.impl.ReservaServiceImpl;

@RestController
@RequestMapping("/api/carwash/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("crear")
    public String crearReserva(@RequestBody CreateReservaDTO datos){
        return this.reservaServiceImpl.crearReserva(datos);
    }

}
