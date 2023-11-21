package hn.unah.lenguajes.carwash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateReservaDTO {
    
    private int idCliente;

    private int idVehiculo;

    private int dias;

}
