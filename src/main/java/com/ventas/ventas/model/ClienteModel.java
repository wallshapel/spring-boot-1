package com.ventas.ventas.model;

import lombok.Data;

import javax.persistence.*;

@Entity  // Con este decorador indicamos que esta clase será una entidad (tabla) y no una simple clase plana
@Table(name = "cliente")  // especificamos el nombre de la tabla asociada a este modelo
@Data
public class ClienteModel {
    @Id  // Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremental
    private Integer id;
    @Column(name = "nombre", nullable = false, length = 75)  // Esto es opcional, pero es bueno, sin embargo lo que cuenta es la línea de abajo.
    private String nombre;
    @Column(name = "apellidos", nullable = false, length = 150)  // Esto es opcional, pero es bueno, sin embargo lo que cuenta es la línea de abajo.
    private String apellidos;
    @Column(name = "direccion", nullable = true, length = 150)  // Esto es opcional, pero es bueno, sin embargo lo que cuenta es la línea de abajo.
    private String direccion;
    @Column(name = "telefono", nullable = true, length = 150)  // Esto es opcional, pero es bueno, sin embargo lo que cuenta es la línea de abajo.
    private String telefono;
    @Column(name = "email", nullable = true, length = 55)  // Esto es opcional, pero es bueno, sin embargo lo que cuenta es la línea de abajo.
    private String email;
}
