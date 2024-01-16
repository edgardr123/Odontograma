package com.example.odontograma.Form;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
public class HistorialForm implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiObjectField(name = "procedimiento", description = "Procedimiento realizado", required = true)
  @NotBlank
  @Size(max = 500)
  private String procedimiento;

  @PastOrPresent
  @NotNull
  @ApiObjectField(
      name = "fechaprocedimiento",
      description = "Fecha del Procedimiento realizado",
      required = true)
  private Date fechaProcedimiento;

  @Min(0)
  @ApiObjectField(name = "paciente_id", required = true)
  private int paciente_id;
}
