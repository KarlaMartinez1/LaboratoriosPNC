package com.example.laboratorio.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Material {
    private Long id;
    private String nombre;
    private String categoria;
    private String efecto;
    private Double precio;
    private String ubicacion;
    private String rareza;
}
