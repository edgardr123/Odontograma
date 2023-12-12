package com.example.odontograma.Controlador;

import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.DTO.ResponseDTO;
import com.example.odontograma.Form.PacienteForm;
import com.example.odontograma.Servicio.ServicioPaciente;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Paciente")
@RequiredArgsConstructor
public class PacienteControlador {

  @Autowired
  private ServicioPaciente servicioPaciente;

  @PostMapping
  public ResponseEntity<PacienteDTO> guardarPaciente(@RequestBody PacienteForm pacienteForm) {
    System.out.println(pacienteForm);
    return ResponseEntity.ok(servicioPaciente.guardarPaciente(pacienteForm));
  }

  @PutMapping("/{pacienteId}")
  public ResponseEntity<PacienteDTO> actualizarPaciente(
      @PathVariable("pacienteId") long pacienteId, @RequestBody PacienteForm pacienteForm) {
    return ResponseEntity.ok(servicioPaciente.ActualizarPaciente(pacienteId, pacienteForm));
  }

  @GetMapping
  public ResponseEntity<ResponseDTO<PacienteDTO>> obtenerPacientes() {
    return ResponseEntity.ok(ResponseDTO.build(servicioPaciente.ObtenerTodosLosPacientes()));
  }

  @GetMapping("/Paciente/{id}")
  public ResponseEntity<PacienteDTO> obtenerPacienteId(@PathVariable Long id) {
    return ResponseEntity.ok(servicioPaciente.ObtenerPacienteId(id));
  }

  @DeleteMapping("/Paciente/{id}/Eliminar")
  public ResponseEntity<Void> EliminarPaciente(@PathVariable Long id) {
    servicioPaciente.EliminarPaciente(id);
    return ResponseEntity.ok().build();
  }
}
