package com.example.odontograma.Repositorio;

import com.example.odontograma.Entidad.Odontograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteOdontogramaRepositorio extends JpaRepository<Odontograma, Long> {}
