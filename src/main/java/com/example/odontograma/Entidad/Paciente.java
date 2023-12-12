package com.example.odontograma.Entidad;

import com.example.odontograma.Form.PacienteForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "pacientes")
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Paciente implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nombre", length = 60, nullable = false)
  private String nombre;

  @Column(name = "apellidoP", length = 60, nullable = false)
  private String apellidoP;

  @Column(name = "apellidoM", length = 60, nullable = false)
  private String apellidoM;

  @Column(name = "email", length = 60, nullable = false, unique = true)
  private String email;

  @Column(name = "telefono")
  private String telefono;

  @Column(name = "direccion")
  private String direccion;

  @Column(name = "ciudad")
  private String ciudad;

  @Column(name = "codigo_postal")
  private String codigoPostal;

  @Column(name = "sexo")
  private String sexo;

  @Column(name = "edad")
  private Integer edad;

  @Column(name = "fecha_nacimiento")
  private Date fechaNacimiento;

  @Column(name = "ocupacion")
  private String ocupacion;

  @Column(name = "medicamentos", length = 600)
  private String medicamentos;

  @Column(name = "alergias", length = 600)
  private String alergias;

  @Column(name = "reacciones", length = 600)
  private String reacciones;

  // TODO notas adicionales

  public Paciente(PacienteForm pacienteForm) {

    this.nombre = pacienteForm.getNombre();
    this.apellidoP = pacienteForm.getApellidoP();
    this.apellidoM = pacienteForm.getApellidoM();
    this.email = pacienteForm.getEmail();
    this.telefono = pacienteForm.getTelefono();
    this.direccion = pacienteForm.getDireccion();
    this.ciudad = pacienteForm.getCiudad();
    this.codigoPostal = pacienteForm.getCodigoPostal();
    this.sexo = pacienteForm.getSexo();
    this.edad = pacienteForm.getEdad();
    this.fechaNacimiento = pacienteForm.getFechaNacimiento();
    this.ocupacion = pacienteForm.getOcupacion();
    this.medicamentos = pacienteForm.getMedicamentos();
    this.alergias = pacienteForm.getAlergias();
    this.reacciones = pacienteForm.getReacciones();
  }

  public void Actualizar(PacienteForm pacienteForm) {

    this.nombre = pacienteForm.getNombre();
    this.apellidoP = pacienteForm.getApellidoP();
    this.apellidoM = pacienteForm.getApellidoM();
    this.email = pacienteForm.getEmail();
    this.telefono = pacienteForm.getTelefono();
    this.direccion = pacienteForm.getDireccion();
    this.ciudad = pacienteForm.getCiudad();
    this.codigoPostal = pacienteForm.getCodigoPostal();
    this.sexo = pacienteForm.getSexo();
    this.edad = pacienteForm.getEdad();
    this.fechaNacimiento = pacienteForm.getFechaNacimiento();
    this.ocupacion = pacienteForm.getOcupacion();
    this.medicamentos = pacienteForm.getMedicamentos();
    this.alergias = pacienteForm.getAlergias();
    this.reacciones = pacienteForm.getReacciones();
  }
}
