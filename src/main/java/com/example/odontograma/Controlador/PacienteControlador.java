package com.example.odontograma.Controlador;

import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.DTO.ResponseDTO;
import com.example.odontograma.Entidad.Paciente;
import com.example.odontograma.Form.PacienteForm;
import com.example.odontograma.Servicio.ServicioPaciente;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Paciente")
@RequiredArgsConstructor

public class PacienteControlador {

    private ServicioPaciente servicioPaciente;
    @PostMapping
    public ResponseEntity<PacienteDTO> guardarPaciente(@RequestBody PacienteForm pacienteForm) {
        return ResponseEntity.ok(servicioPaciente.GuardarPaciente(pacienteForm));
    }

    @PutMapping("/{pacienteId}")
    public ResponseEntity<PacienteDTO> actualizarPaciente(@PathVariable("pacienteId")long pacienteId, @RequestBody PacienteForm pacienteForm) {
        return ResponseEntity.ok(servicioPaciente.ActualizarPaciente(pacienteId, pacienteForm));
    }

    @GetMapping
    public ResponseEntity<ResponseDTO <PacienteDTO>> obtenerPacientes(@RequestBody PacienteForm pacienteForm) {
        return ResponseEntity.ok(ResponseDTO.build(servicioPaciente.ObtenerTodosLosPacientes()));
    }

    @GetMapping("/Odontograma/{id}")
    public ResponseEntity<PacienteDTO> obtenerPacienteId(@PathVariable Long id){
        return ResponseEntity.ok(servicioPaciente.ObtenerPacienteId(id));
    }

    @GetMapping("/Odontograma/{id}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable Long id){
        servicioPaciente.EliminarPaciente(id);
        return ResponseEntity.ok().build();
    }

}
