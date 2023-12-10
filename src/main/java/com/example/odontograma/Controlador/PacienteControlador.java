package com.example.odontograma.Controlador;


import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.Entidad.Paciente;
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
    public ResponseEntity<String> guardarPaciente(@RequestBody Paciente paciente) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    @GetMapping("/Odontograma/{id}")
    public ResponseEntity<PacienteDTO> obtenerPacienteId(@PathVariable Long id){

        return ResponseEntity.ok(servicioPaciente.ObtenerPacienteId(id));
    }

}
