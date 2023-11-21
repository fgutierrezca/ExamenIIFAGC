package hn.unah.lenguajes.carwash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateVehiculoDTO {
    private String marca;

    private int anio;

    private boolean disponible;

    private int idtipovehiculo;
}
