package com.example.odontograma.Repositorio;

import com.example.odontograma.Entidad.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepositorio extends JpaRepository<Historial, Long> {}
