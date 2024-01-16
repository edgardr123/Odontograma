package com.example.odontograma.Servicio;

import com.example.odontograma.DTO.HistorialDTO;
import com.example.odontograma.Entidad.Historial;
import com.example.odontograma.Form.HistorialForm;
import com.example.odontograma.Repositorio.HistorialRepositorio;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ServicioHistorial {

  private final HistorialRepositorio historialRepositorio;

  public List<HistorialDTO> ObtenerTodosLosHistoriales() {

    return historialRepositorio.findAll().stream().map(HistorialDTO::build).toList();
  }

  public HistorialDTO guardarHistorial(HistorialForm historialForm) {
    final Historial historial = new Historial(historialForm);
    historialRepositorio.save(historial);
    return HistorialDTO.build(historial);
  }

  public HistorialDTO ActualizarHistorial(long historialId, HistorialForm historialForm) {
    final Historial historial = BuscarPorId(historialId);
    historial.ActualizarHistorial(historialForm);
    historialRepositorio.save(historial);
    return HistorialDTO.build(historial);
  }

  public HistorialDTO ObtenerHistorialId(Long id) {
    Historial historial = BuscarPorId(id);
    return HistorialDTO.build(historial);
  }

  public void EliminarHistorial(long historialId) {
    final Historial historial = BuscarPorId(historialId);
    historialRepositorio.delete(historial);
  }

  public Historial BuscarPorId(long historiaId) {
    Optional<Historial> historial = historialRepositorio.findById(historiaId);
    return historial.get();
  }
}
