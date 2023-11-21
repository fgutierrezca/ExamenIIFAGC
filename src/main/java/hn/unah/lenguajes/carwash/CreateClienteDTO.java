package hn.unah.lenguajes.carwash;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateClienteDTO {
    private String nombre;

    private String apellido;

    private Date fechaIngreso;

    private int idtipocliente;
}
