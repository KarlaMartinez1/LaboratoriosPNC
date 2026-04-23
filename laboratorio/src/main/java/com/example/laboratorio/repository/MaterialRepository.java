package com.example.laboratorio.repository;

import com.example.laboratorio.common.MaterialList;
import com.example.laboratorio.domain.entity.Material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final MaterialList materialList;

    public List<Material> findAll(){
        return materialList.getMaterials();
    }
}
