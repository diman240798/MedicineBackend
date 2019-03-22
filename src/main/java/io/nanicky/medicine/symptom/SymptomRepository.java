package io.nanicky.medicine.symptom;

import io.nanicky.medicine.symptom.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, String> {

}
