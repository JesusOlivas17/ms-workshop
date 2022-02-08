package com.nuuptech.training.reservationservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Concepto implements Serializable {

    private Long id;

    private String nombre;

    private boolean activo;

}
