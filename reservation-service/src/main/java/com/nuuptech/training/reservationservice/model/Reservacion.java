package com.nuuptech.training.reservationservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Reservacion implements Serializable {

    private Long id;

    private Date fechaDeCreacion = new Date();

    private Long clienteId;

    private Long vehiculoId;

    private Float kilometrajeInicial;

    private Float kilometrajeFinal;

    private Float nivelCombustibleInicial;

    private Float nivelCombustibleEntrega;

    private Date fechaDeEntrega;

    private Date fechaRealDeEntrega;

    private String observaciones;

}
