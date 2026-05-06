package com.tallerBici.proyecto.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;




  @ManyToMany
  @JoinTable(name = "boletas_empleados",
      joinColumns = @JoinColumn(name = "boleta_id"),
      inverseJoinColumns = @JoinColumn(name = "empleado_id")
    )
    private List<Empleado> empleados;

    @ManyToOne
    @JoinColumn (name = "TipoPago_id")
    private TipoPago tipoPago;


}
