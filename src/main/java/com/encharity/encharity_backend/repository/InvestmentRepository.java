package com.encharity.encharity_backend.repository;

import com.encharity.encharity_backend.model.Investment;
import com.encharity.encharity_backend.model.Patient;
import com.encharity.encharity_backend.model.UrgentPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
