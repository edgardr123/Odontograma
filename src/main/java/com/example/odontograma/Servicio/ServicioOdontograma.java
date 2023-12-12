package com.example.odontograma.Servicio;

import com.example.odontograma.DTO.OdontogramaDTO;
import com.example.odontograma.Entidad.Odontograma;
import com.example.odontograma.Form.OdontogramaForm;
import com.example.odontograma.Repositorio.PacienteOdontogramaRepositorio;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ServicioOdontograma {

  private final PacienteOdontogramaRepositorio pacienteOdontogramaRepositorio;

  public List<OdontogramaDTO> ObtenerTodosLosOdontogramas() {

    return pacienteOdontogramaRepositorio.findAll().stream().map(OdontogramaDTO::build).toList();
  }

  public OdontogramaDTO GuardarOdontograma(OdontogramaForm odontogramaForm) {
    final Odontograma odontograma = new Odontograma(odontogramaForm);
    pacienteOdontogramaRepositorio.save(odontograma);
    return OdontogramaDTO.build(odontograma);
  }

  public OdontogramaDTO ActualizarOdontograma(long odontogramaId, OdontogramaForm odontogramaForm) {
    final Odontograma odontograma = BuscarPorId(odontogramaId);
    odontograma.ActualizarOdontograma(odontogramaForm);
    pacienteOdontogramaRepositorio.save(odontograma);
    return OdontogramaDTO.build(odontograma);
  }

  public OdontogramaDTO ObtenerOdontogramaId(Long id) {
    Odontograma odontograma = BuscarPorId(id);
    return OdontogramaDTO.build(odontograma);
  }

  public void EliminarOdontograma(long odontogramaId) {
    final Odontograma odontograma = BuscarPorId(odontogramaId);
    pacienteOdontogramaRepositorio.delete(odontograma);
  }

  public Odontograma BuscarPorId(long odontogramId) {
    Optional<Odontograma> odontograma = pacienteOdontogramaRepositorio.findById(odontogramId);
    return odontograma.get();
  }
}
