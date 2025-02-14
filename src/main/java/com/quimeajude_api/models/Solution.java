package com.quimeajude_api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "Solutions")
public class Solution {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private Long id;

    @NotBlank
    private double volume;

    @NotBlank
    private double molarity;

    @NotBlank
    private double density;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMolarity() {
        return molarity;
    }

    public void setMolarity(double molarity) {
        this.molarity = molarity;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
