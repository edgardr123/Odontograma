package com.example.odontograma.Servicio;


import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.Entidad.Paciente;
import com.example.odontograma.Repositorio.PacienteRepositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j

public class ServicioPaciente {

    private final PacienteRepositorio pacienteRepositorio;

    public List<Paciente> ObtenerTodosLosPacientes(){
        return pacienteRepositorio.findAll();
    }

    public Paciente GuardarPaciente(Paciente paciente) {
        return pacienteRepositorio.save(paciente);
    }

    public PacienteDTO ObtenerPacienteId(Long id){
        final Paciente paciente = pacienteRepositorio.getById(id);
        return PacienteDTO.builder().nombre(paciente.getNombre())
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
                .reacciones(paciente.getReacciones()).build();
    }
}
