package com.encharity.encharity_backend.repository;

import com.encharity.encharity_backend.model.UrgentPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrgentPatientRepository extends JpaRepository<UrgentPatient, Long> {
}
