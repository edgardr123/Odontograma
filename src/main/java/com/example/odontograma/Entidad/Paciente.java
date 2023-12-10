package com.example.odontograma.Entidad;
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
public class Paciente implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    //TODO notas adicionales

    public Paciente(String nombre,
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
                    String reacciones) {

        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
        this.medicamentos = medicamentos;
        this.alergias = alergias;
        this.reacciones = reacciones;
    }
}
