package io.nanicky.medicine.symptom;

import io.nanicky.medicine.illness.Illness;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Symptoms")
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private String id;
    @Column(name = "Name")
    private String name;
    @ManyToMany(targetEntity= Illness.class, fetch= FetchType.EAGER)
    List<Illness> illnesses;

    public Symptom(String name, List<Illness> illnesses) {
        this.name = name;
        this.illnesses = illnesses;
    }

    public Symptom() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Symptom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Illness> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(List<Illness> illnesses) {
        this.illnesses = illnesses;
    }
}
