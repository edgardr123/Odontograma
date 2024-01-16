package com.example.odontograma.Controlador;

import com.example.odontograma.DTO.OdontogramaDTO;
import com.example.odontograma.DTO.ResponseDTO;
import com.example.odontograma.Form.OdontogramaForm;
import com.example.odontograma.Servicio.ServicioOdontograma;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/odontograma")
@RequiredArgsConstructor
public class OdontogramaControlador {

  @Autowired private ServicioOdontograma servicioOdontograma;

  @PostMapping
  public ResponseEntity<OdontogramaDTO> guardarOdontograma(
      @RequestBody OdontogramaForm odontogramaForm) {
    return ResponseEntity.ok(servicioOdontograma.GuardarOdontograma(odontogramaForm));
  }

  @PutMapping("/{odontogramaId}")
  public ResponseEntity<OdontogramaDTO> actualizarOdontograma(
      @PathVariable("odontogramaId") long odontogramaId,
      @RequestBody OdontogramaForm odontogramaForm) {
    return ResponseEntity.ok(
        servicioOdontograma.ActualizarOdontograma(odontogramaId, odontogramaForm));
  }

  @GetMapping
  public ResponseEntity<ResponseDTO<OdontogramaDTO>> ObtenerOdontogramas() {
    return ResponseEntity.ok(ResponseDTO.build(servicioOdontograma.ObtenerTodosLosOdontogramas()));
  }

  @GetMapping("/{id}")
  public ResponseEntity<OdontogramaDTO> ObtenerOdontogramaId(@PathVariable Long id) {
    return ResponseEntity.ok(servicioOdontograma.ObtenerOdontogramaId(id));
  }

  @DeleteMapping("{id}/Eliminar")
  public ResponseEntity<Void> EliminarOdontograma(@PathVariable Long id) {
    servicioOdontograma.EliminarOdontograma(id);
    return ResponseEntity.ok().build();
  }
}
