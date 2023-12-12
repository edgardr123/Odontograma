package com.example.odontograma.Form;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
public class PacienteForm implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiObjectField(name = "nombre", description = "Nombre del paciente", required = true)
  @NotBlank
  @Size(max = 50)
  private String nombre;

  @ApiObjectField(
      name = "apellidoP",
      description = "Apellido Paterno del paciente",
      required = true)
  @NotBlank
  @Size(max = 50)
  private String apellidoP;

  @ApiObjectField(
      name = "apellidoM",
      description = "Apellido Materno del paciente",
      required = true)
  @NotBlank
  @Size(max = 50)
  private String apellidoM;

  @Email
  @Size(max = 150)
  @ApiObjectField(name = "email", description = "Email del paciente")
  private String email;

  @ApiObjectField(name = "telefono", description = "Telefono del paciente", required = true)
  @NotBlank
  @Size(max = 50)
  private String telefono;

  @ApiObjectField(name = "direccion", description = "Direccion del paciente", required = true)
  @NotBlank
  @Size(max = 50)
  private String direccion;

  @ApiObjectField(name = "ciudad", description = "Ciudad del paciente", required = true)
  @NotBlank
  @Size(max = 50)
  private String ciudad;

  @ApiObjectField(
      name = "codigoPostal",
      description = "Codigo postal del paciente",
      required = true)
  @NotBlank
  @Size(max = 50)
  private String codigoPostal;

  @ApiObjectField(name = "sexo", description = "Sexo del paciente", required = true)
  @NotBlank
  @Size(max = 50)
  private String sexo;

  @Min(0)
  @Max(120)
  @ApiObjectField(name = "edad", description = "Edad del paciente", required = true)
  private int edad;

  @PastOrPresent
  @NotNull
  @ApiObjectField(name = "direccion", description = "Diriccion del paciente", required = true)
  private Date fechaNacimiento;

  @ApiObjectField(name = "ocupacion", description = "Ocupacion del paciente", required = true)
  @NotBlank
  @Size(max = 150)
  private String ocupacion;

  @ApiObjectField(name = "medicamentos", description = "Medicamentos que toma", required = true)
  @NotBlank
  @Size(max = 600)
  private String medicamentos;

  @ApiObjectField(name = "alergias", description = "Alergias del paciente", required = true)
  @NotBlank
  @Size(max = 600)
  private String alergias;

  @ApiObjectField(name = "reacciones", description = "Reacciones del paciente", required = true)
  @NotBlank
  @Size(max = 600)
  private String reacciones;
}
