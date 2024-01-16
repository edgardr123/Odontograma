package com.example.odontograma.DTO;

import com.example.odontograma.Entidad.Historial;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HistorialDTO {

  private String procedimiento;

  private Date fechaProcedimiento;

  private int paciente_id;

  public static HistorialDTO build(Historial historial) {
    return HistorialDTO.builder()
        .procedimiento(historial.getProcedimiento())
        .fechaProcedimiento(historial.getFechaProcedimiento())
            .paciente_id(historial.getPaciente_id())
        .build();
  }
}
