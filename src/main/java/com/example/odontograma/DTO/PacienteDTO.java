package com.example.odontograma.DTO;

import com.example.odontograma.Entidad.Paciente;
import java.util.Date;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PacienteDTO {

  private Integer id;

  private String nombre;

  private String apellidoP;

  private String apellidoM;

  private String email;

  private String telefono;

  private String direccion;

  private String ciudad;

  private String codigoPostal;

  private String sexo;

  private int edad;

  private Date fechaNacimiento;

  private String ocupacion;

  private String medicamentos;

  private String alergias;

  private String reacciones;

  public static PacienteDTO build(Paciente paciente) {
    return PacienteDTO.builder()
            .id(paciente.getId())
        .nombre(paciente.getNombre())
        .apellidoP(paciente.getApellidoP())
        .apellidoM(paciente.getApellidoM())
        .email(paciente.getEmail())
        .telefono(paciente.getTelefono())
        .direccion(paciente.getDireccion())
        .ciudad(paciente.getCiudad())
        .codigoPostal(paciente.getCodigoPostal())
        .sexo(paciente.getSexo())
        .edad(paciente.getEdad())
        .fechaNacimiento(paciente.getFechaNacimiento())
        .ocupacion(paciente.getOcupacion())
        .medicamentos(paciente.getMedicamentos())
        .alergias(paciente.getAlergias())
        .reacciones(paciente.getReacciones())
        .build();
  }
}
