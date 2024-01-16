package com.example.odontograma.Servicio;

import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.Entidad.Paciente;
import com.example.odontograma.Form.PacienteForm;
import com.example.odontograma.Repositorio.PacienteRepositorio;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ServicioPaciente {

  private final PacienteRepositorio pacienteRepositorio;

  public List<PacienteDTO> ObtenerTodosLosPacientes() {
    return pacienteRepositorio.findAll().stream().map(PacienteDTO::build).toList();
  }

  public PacienteDTO guardarPaciente(PacienteForm pacienteForm) {
    final Paciente paciente = new Paciente(pacienteForm);
    pacienteRepositorio.save(paciente);
    return PacienteDTO.build(paciente);
  }

  public PacienteDTO ActualizarPaciente(long pacienteId, PacienteForm pacienteForm) {
    final Paciente paciente = BuscarPorId(pacienteId);
    paciente.Actualizar(pacienteForm);
    pacienteRepositorio.save(paciente);
    return PacienteDTO.build(paciente);
  }

  public PacienteDTO ObtenerPacienteId(Long id) {
    Paciente paciente = BuscarPorId(id);
    return PacienteDTO.build(paciente);
  }

  public void EliminarPaciente(long pacienteId) {
    final Paciente paciente = BuscarPorId(pacienteId);
    pacienteRepositorio.delete(paciente);
  }

  public Paciente BuscarPorId(long pacientId) {
    Optional<Paciente> paciente = pacienteRepositorio.findById(pacientId);
    return paciente.get();
  }
}
