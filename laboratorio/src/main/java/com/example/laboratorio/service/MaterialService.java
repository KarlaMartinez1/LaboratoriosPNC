package com.example.laboratorio.service;

import com.example.laboratorio.domain.entity.Material;
import com.example.laboratorio.repository.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository materialRepository;

    public List<Material> ordenarPorPrecio() {
        return materialRepository.findAll().stream()
                .sorted((e1, e2) -> Double.compare(e2.getPrecio(), e1.getPrecio()))
                .toList();
    }
    public List<Material> obtenerLegendario(){
        return materialRepository.findAll().stream()
                .filter(material -> material.getRareza().equalsIgnoreCase("Legendario"))
                .toList();
    }
    public List<String> obtenerUbicaciones(){
        return materialRepository.findAll().stream()
                .map(Material::getUbicacion)
                .distinct()
                .toList();
    }
    public Material materialMasCaro() {
        return materialRepository.findAll().stream()
                .max((e1, e2) -> Double.compare(e1.getPrecio(), e2.getPrecio()))
                .orElse(null);
    }


}
