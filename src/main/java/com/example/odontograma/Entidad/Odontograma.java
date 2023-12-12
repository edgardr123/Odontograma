package com.example.odontograma.Entidad;

import com.example.odontograma.Form.OdontogramaForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "pacientes_odontograma")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Odontograma implements Serializable {

  private static final long serialVersionUid = 1L;

  // TODO Cambiar string a int
  // Superior Derecha

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "sd11")
  private int sd11;

  @Column(name = "sd12")
  private int sd12;

  @Column(name = "sd13")
  private int sd13;

  @Column(name = "sd14")
  private int sd14;

  @Column(name = "sd15")
  private int sd15;

  @Column(name = "sd16")
  private int sd16;

  @Column(name = "sd17")
  private int sd17;

  @Column(name = "sd18")
  private int sd18;

  // Superior Izquierda
  @Column(name = "si21")
  private int si21;

  @Column(name = "si22")
  private int si22;

  @Column(name = "si23")
  private int si23;

  @Column(name = "si24")
  private int si24;

  @Column(name = "si25")
  private int si25;

  @Column(name = "si26")
  private int si26;

  @Column(name = "si27")
  private int si27;

  @Column(name = "si28")
  private int si28;

  // Inferior Izquierda
  @Column(name = "iz31")
  private int iz31;

  @Column(name = "iz32")
  private int iz32;

  @Column(name = "iz33")
  private int iz33;

  @Column(name = "iz34")
  private int iz34;

  @Column(name = "iz35")
  private int iz35;

  @Column(name = "iz36")
  private int iz36;

  @Column(name = "iz37")
  private int iz37;

  @Column(name = "iz38")
  private int iz38;

  // Inferior Derecha
  @Column(name = "id41")
  private int id41;

  @Column(name = "id42")
  private int id42;

  @Column(name = "id43")
  private int id43;

  @Column(name = "id44")
  private int id44;

  @Column(name = "id45")
  private int id45;

  @Column(name = "id46")
  private int id46;

  @Column(name = "id47")
  private int id47;

  @Column(name = "id48")
  private int id48;

  @Column(name = "paciente_id", nullable = false)
  private int paciente_id;

  public Odontograma(OdontogramaForm odontogramaForm) {

    this.sd11 = odontogramaForm.getSd11();
    this.sd12 = odontogramaForm.getSd12();
    this.sd13 = odontogramaForm.getSd13();
    this.sd14 = odontogramaForm.getSd14();
    this.sd15 = odontogramaForm.getSd15();
    this.sd16 = odontogramaForm.getSd16();
    this.sd17 = odontogramaForm.getSd17();
    this.sd18 = odontogramaForm.getSd18();
    this.si21 = odontogramaForm.getSi21();
    this.si22 = odontogramaForm.getSi22();
    this.si23 = odontogramaForm.getSi23();
    this.si24 = odontogramaForm.getSi24();
    this.si25 = odontogramaForm.getSi25();
    this.si26 = odontogramaForm.getSi26();
    this.si27 = odontogramaForm.getSi27();
    this.si28 = odontogramaForm.getSi28();
    this.iz31 = odontogramaForm.getIz31();
    this.iz32 = odontogramaForm.getIz32();
    this.iz33 = odontogramaForm.getIz33();
    this.iz34 = odontogramaForm.getIz34();
    this.iz35 = odontogramaForm.getIz35();
    this.iz36 = odontogramaForm.getIz36();
    this.iz37 = odontogramaForm.getIz37();
    this.iz38 = odontogramaForm.getIz38();
    this.id41 = odontogramaForm.getId41();
    this.id42 = odontogramaForm.getId42();
    this.id43 = odontogramaForm.getId43();
    this.id44 = odontogramaForm.getId44();
    this.id45 = odontogramaForm.getId45();
    this.id46 = odontogramaForm.getId46();
    this.id47 = odontogramaForm.getId47();
    this.id48 = odontogramaForm.getId48();
    this.paciente_id = odontogramaForm.getPaciente_id();
  }

  public void ActualizarOdontograma(OdontogramaForm odontogramaForm) {

    this.sd11 = odontogramaForm.getSd11();
    this.sd12 = odontogramaForm.getSd12();
    this.sd13 = odontogramaForm.getSd13();
    this.sd14 = odontogramaForm.getSd14();
    this.sd15 = odontogramaForm.getSd15();
    this.sd16 = odontogramaForm.getSd16();
    this.sd17 = odontogramaForm.getSd17();
    this.sd18 = odontogramaForm.getSd18();
    this.si21 = odontogramaForm.getSi21();
    this.si22 = odontogramaForm.getSi22();
    this.si23 = odontogramaForm.getSi23();
    this.si24 = odontogramaForm.getSi24();
    this.si25 = odontogramaForm.getSi25();
    this.si26 = odontogramaForm.getSi26();
    this.si27 = odontogramaForm.getSi27();
    this.si28 = odontogramaForm.getSi28();
    this.iz31 = odontogramaForm.getIz31();
    this.iz32 = odontogramaForm.getIz32();
    this.iz33 = odontogramaForm.getIz33();
    this.iz34 = odontogramaForm.getIz34();
    this.iz35 = odontogramaForm.getIz35();
    this.iz36 = odontogramaForm.getIz36();
    this.iz37 = odontogramaForm.getIz37();
    this.iz38 = odontogramaForm.getIz38();
    this.id41 = odontogramaForm.getId41();
    this.id42 = odontogramaForm.getId42();
    this.id43 = odontogramaForm.getId43();
    this.id44 = odontogramaForm.getId44();
    this.id45 = odontogramaForm.getId45();
    this.id46 = odontogramaForm.getId46();
    this.id47 = odontogramaForm.getId47();
    this.id48 = odontogramaForm.getId48();
    this.paciente_id = odontogramaForm.getPaciente_id();
  }
}
