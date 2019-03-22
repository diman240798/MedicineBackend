package io.nanicky.medicine.illness;

import io.nanicky.medicine.symptom.Symptom;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Illness")
public class Illness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
    private String id;
    @Column(name = "Description")
    private String description;

    @ManyToMany(targetEntity= Symptom.class, fetch= FetchType.EAGER)
    private List<Symptom> symptoms;

    public Illness(String description, List<Symptom> symptoms) {
        this.description = description;
        this.symptoms = symptoms;
    }

    public Illness() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
}
