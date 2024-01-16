package com.example.odontograma.Form;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import lombok.Data;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
public class OdontogramaForm implements Serializable {

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd11", required = true)
  private int sd11;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd12", required = true)
  private int sd12;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd13", required = true)
  private int sd13;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd14", required = true)
  private int sd14;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd15", required = true)
  private int sd15;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd16", required = true)
  private int sd16;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd17", required = true)
  private int sd17;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "sd18", required = true)
  private int sd18;

  // Superior Izquierda
  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si21", required = true)
  private int si21;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si22", required = true)
  private int si22;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si23", required = true)
  private int si23;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si24", required = true)
  private int si24;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si25", required = true)
  private int si25;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si26", required = true)
  private int si26;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si27", required = true)
  private int si27;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "si28", required = true)
  private int si28;

  // Inferior Izquierda
  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz31", required = true)
  private int iz31;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz32", required = true)
  private int iz32;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz33", required = true)
  private int iz33;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz34", required = true)
  private int iz34;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz35", required = true)
  private int iz35;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz36", required = true)
  private int iz36;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz37", required = true)
  private int iz37;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "iz38", required = true)
  private int iz38;

  // Inferior Derecha
  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id41", required = true)
  private int id41;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id42", required = true)
  private int id42;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id43", required = true)
  private int id43;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id44", required = true)
  private int id44;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id45", required = true)
  private int id45;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id46", required = true)
  private int id46;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id47", required = true)
  private int id47;

  @Min(0)
  @Max(6)
  @ApiObjectField(name = "id48", required = true)
  private int id48;

  @Min(0)
  @ApiObjectField(name = "paciente_id", required = true)
  private int paciente_id;
}
