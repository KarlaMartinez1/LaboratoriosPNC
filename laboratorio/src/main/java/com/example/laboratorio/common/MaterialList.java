package com.example.laboratorio.common;

import com.example.laboratorio.domain.entity.Material;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialList {
    private final List<Material> materials;

    public MaterialList() {
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1L)
                .nombre("Ámbar Rojo")
                .categoria("Mineral")
                .efecto("Corazones")
                .precio(67.76)
                .ubicacion("Desierto Gerudo")
                .rareza("Poco Raro")
                .build());

        this.materials.add(Material.builder()
                .id(2L)
                .nombre("Ámbar Naranja")
                .categoria("Planta")
                .efecto("Defensa")
                .precio(75.82)
                .ubicacion(" Volcán de Eldin")
                .rareza("Raro")
                .build());

        this.materials.add(Material.builder()
                .id(3L)
                .nombre("Ámbar")
                .categoria("Comida")
                .efecto("Estamina")
                .precio(58.25)
                .ubicacion("Cordillera de Hebra")
                .rareza("Legendario")
                .build());

        this.materials.add(Material.builder()
                .id(4L)
                .nombre("Ala de Keese")
                .categoria("Parte de monstruo")
                .efecto("Corazones")
                .precio(78.60)
                .ubicacion("Cordillera de Hebra")
                .rareza("Legendario")
                .build());
    }

    public List<Material> getMaterials() {
        return materials;
    }
}
