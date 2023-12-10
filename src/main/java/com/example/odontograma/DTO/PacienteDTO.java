package com.example.odontograma.DTO;


import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Builder
public class PacienteDTO {

    private String nombre;

    private String apellidoP;

    private String apellidoM;

    private String email;

    private String telefono;

    private String direccion;

    private String ciudad;

    private String codigoPostal;

    private String sexo;

    private Integer edad;

    private Date fechaNacimiento;

    private String ocupacion;

    private String medicamentos;

    private String alergias;

    private String reacciones;

    public static PacienteDTO build( String nombre,
                                     String apellidoP,
                                     String apellidoM,
                                     String email,
                                     String telefono,
                        String direccion,
     String ciudad,
     String codigoPostal,
     String sexo,
     Integer edad,
     Date fechaNacimiento,
     String ocupacion,
     String medicamentos,
     String alergias,
     String reacciones){
        return PacienteDTO.builder()
                .nombre(nombre)
                .apellidoP(apellidoP)
                .apellidoM(apellidoM)
                .email(email)
                .telefono(telefono)
                .direccion(direccion)
                .ciudad(ciudad)
                .codigoPostal(codigoPostal)
                .sexo(sexo)
                .edad(edad)
                .fechaNacimiento(fechaNacimiento)
                .ocupacion(ocupacion)
                .medicamentos(medicamentos)
                .alergias(alergias)
                .reacciones(reacciones)
                .build();
    }
}
