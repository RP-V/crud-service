package com.unipampa.crudservice.repository;

import com.unipampa.crudservice.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<Proprietario, Long> {
}
