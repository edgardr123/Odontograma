package com.example.odontograma.Entidad;

import com.example.odontograma.Form.HistorialForm;
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
@Table(name = "historial")
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Historial implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "procedimiento", length = 500, nullable = false)
  private String procedimiento;

  @Column(name = "fechaprocedimiento")
  private Date fechaProcedimiento;

  @Column(name = "paciente_id", nullable = false)
  private int paciente_id;

  public Historial(HistorialForm historialForm) {
    this.procedimiento = historialForm.getProcedimiento();
    this.fechaProcedimiento = historialForm.getFechaProcedimiento();
    this.paciente_id = historialForm.getPaciente_id();
  }

  public void ActualizarHistorial(HistorialForm historialForm) {
    this.procedimiento = historialForm.getProcedimiento();
    this.fechaProcedimiento = historialForm.getFechaProcedimiento();
    this.paciente_id = historialForm.getPaciente_id();
  }
}
