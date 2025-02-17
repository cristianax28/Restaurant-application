package com.example.cristiana.repository;

import com.example.cristiana.model.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepository extends JpaRepository<Rezervare, Long> {
}
