package com.example.laboratorio;

import com.example.laboratorio.domain.entity.Material;
import com.example.laboratorio.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LaboratorioApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaboratorioApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService){

        return args -> {
            System.out.println("\n--  Tesoros pa Link (? --\n");

            materialService.ordenarPorPrecio().forEach(m ->
                    System.out.println(String.format("[HYRULE-DB] Nombre: %s | Categoría: %s | Precio: %.2f Rupias",
                            m.getNombre(), m.getCategoria(), m.getPrecio()))
            );

            Material top = materialService.materialMasCaro();
            if(top != null) {
                System.out.println("\n[HYRULE-DB] Material mas caro, Link: " + top.getNombre() + " (" + top.getPrecio() + " Rupias)");
            }

            System.out.println("\n--- Material Legendario ---");
            materialService.obtenerLegendario().forEach(l ->
                    System.out.println("[HYRULE-DB] Legendario: " + l.getNombre())
            );

            System.out.println("\n--- Ubicaciones del mapa ---");
            materialService.obtenerUbicaciones().forEach(u ->
                    System.out.println("[HYRULE-DB] Ubicación: " + u.trim())
            );
        };
    }
}

