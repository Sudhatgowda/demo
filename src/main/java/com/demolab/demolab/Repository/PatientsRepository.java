package com.demolab.demolab.Repository;

import com.demolab.demolab.Model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

//Create interface, for repositore extends JPA, imported class from patients long type

public interface PatientsRepository extends JpaRepository<Patients, Long> {

}
