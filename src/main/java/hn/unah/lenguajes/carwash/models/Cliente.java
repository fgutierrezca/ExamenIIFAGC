package hn.unah.lenguajes.carwash.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocliente")
    private int idCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private Date fechaIngreso;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
    private TipoCliente tipoCliente;

}
