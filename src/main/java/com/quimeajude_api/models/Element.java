package com.quimeajude_api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "Elements")
public class Element {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private Long id;

    @Column (unique = true)
    @NotBlank
    private String name;

    @Column (unique = true)
    @NotBlank
    private double atomicMass;

    @Column (unique = true)
    @NotBlank
    private String atomicSymbol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getAtomicSymbol() {
        return atomicSymbol;
    }

    public void setAtomicSymbol(String atomicSymbol) {
        this.atomicSymbol = atomicSymbol;
    }
}
