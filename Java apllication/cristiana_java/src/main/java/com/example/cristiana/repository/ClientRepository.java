package com.example.cristiana.repository;

import com.example.cristiana.model.Clienti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clienti, Integer> {
}
