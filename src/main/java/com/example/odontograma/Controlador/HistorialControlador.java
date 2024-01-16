package com.example.odontograma.Controlador;

import com.example.odontograma.DTO.HistorialDTO;
import com.example.odontograma.DTO.ResponseDTO;
import com.example.odontograma.Form.HistorialForm;
import com.example.odontograma.Servicio.ServicioHistorial;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Historial")
@RequiredArgsConstructor
public class HistorialControlador {

  @Autowired private ServicioHistorial servicioHistorial;

  @PostMapping
  public ResponseEntity<HistorialDTO> guardarHistorial(@RequestBody HistorialForm historialForm) {
    System.out.println(historialForm);
    return ResponseEntity.ok(servicioHistorial.guardarHistorial(historialForm));
  }

  @PutMapping("/{historialId}")
  public ResponseEntity<HistorialDTO> actualizarHistorial(
      @PathVariable("historialId") long historialId, @RequestBody HistorialForm historialForm) {
    return ResponseEntity.ok(servicioHistorial.ActualizarHistorial(historialId, historialForm));
  }

  @GetMapping
  public ResponseEntity<ResponseDTO<HistorialDTO>> obtenerHistorial() {
    return ResponseEntity.ok(ResponseDTO.build(servicioHistorial.ObtenerTodosLosHistoriales()));
  }

  @GetMapping("/Historial/{id}")
  public ResponseEntity<HistorialDTO> obtenerHistorialId(@PathVariable Long id) {
    return ResponseEntity.ok(servicioHistorial.ObtenerHistorialId(id));
  }

  @DeleteMapping("/Historial/{id}/Eliminar")
  public ResponseEntity<Void> EliminarHistorial(@PathVariable Long id) {
    servicioHistorial.EliminarHistorial(id);
    return ResponseEntity.ok().build();
  }
}
