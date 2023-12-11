package com.example.odontograma.Controlador;

import com.example.odontograma.DTO.OdontogramaDTO;
import com.example.odontograma.Entidad.Paciente;
import com.example.odontograma.Servicio.ServicioOdontograma;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Odontograma")
@RequiredArgsConstructor

public class OdontogramaControlador {

    private ServicioOdontograma servicioOdontograma;
    @PostMapping
    public ResponseEntity<String> guardarOdontograma(@RequestBody Paciente paciente) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    @GetMapping("/Odontograma/{id}")
    public ResponseEntity<OdontogramaDTO> obtenerOdontogramaId(@PathVariable Long id){

        return ResponseEntity.ok(servicioOdontograma.ObtenerOdontogramaId(id));
    }
}
