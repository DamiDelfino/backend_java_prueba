package com.ejemplo.backend.repositories;

import com.ejemplo.backend.models.Causa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CausaRepository extends JpaRepository<Causa, Long> {
}