package com.example.laboratorio2.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Pirate")
@Data
@Builder
@AllArgsConstructor
@NamedEntityGraph
@NoArgsConstructor
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "bounty")
    private double bounty;

    @Column(name = "crew")
    private String crew;

    @Column(name = "alive")
    private Boolean isAlive;
}
