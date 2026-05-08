package com.example.laboratorio2.service;

import com.example.laboratorio2.domain.entity.Pirate;

import java.util.List;
import java.util.UUID;

public interface PirateService {
    void createPirate(Pirate pirate);
    List<Pirate> getAllPirates();
    Pirate getById(UUID id);
    void updatePirate(UUID id, Pirate pirate);
    Pirate deletePirate(UUID id);
}
