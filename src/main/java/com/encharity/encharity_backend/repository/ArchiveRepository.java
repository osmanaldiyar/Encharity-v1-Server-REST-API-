package com.encharity.encharity_backend.repository;

import com.encharity.encharity_backend.model.Archive;
import com.encharity.encharity_backend.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchiveRepository extends JpaRepository<Archive, Integer> {
}
