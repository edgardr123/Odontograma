package com.example.odontograma.DTO;

import com.example.odontograma.Entidad.Odontograma;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OdontogramaDTO {

  // Superior Derecha
  private int sd11;
  private int sd12;
  private int sd13;
  private int sd14;
  private int sd15;
  private int sd16;
  private int sd17;
  private int sd18;

  // Superior Izquierda
  private int si21;
  private int si22;
  private int si23;
  private int si24;
  private int si25;
  private int si26;
  private int si27;
  private int si28;

  // Inferior Izquierda
  private int iz31;
  private int iz32;
  private int iz33;
  private int iz34;
  private int iz35;
  private int iz36;
  private int iz37;
  private int iz38;

  // Inferior Derecha
  private int id41;
  private int id42;
  private int id43;
  private int id44;
  private int id45;
  private int id46;
  private int id47;
  private int id48;

  private int paciente_id;

  public static OdontogramaDTO build(Odontograma odontograma) {
    return OdontogramaDTO.builder()
        .sd11(odontograma.getSd11())
        .sd12(odontograma.getSd12())
        .sd13(odontograma.getSd13())
        .sd14(odontograma.getSd14())
        .sd15(odontograma.getSd15())
        .sd16(odontograma.getSd16())
        .sd17(odontograma.getSd17())
        .sd18(odontograma.getSd18())
        .si21(odontograma.getSi21())
        .si22(odontograma.getSi22())
        .si23(odontograma.getSi23())
        .si24(odontograma.getSi24())
        .si25(odontograma.getSi25())
        .si26(odontograma.getSi26())
        .si27(odontograma.getSi27())
        .si28(odontograma.getSi28())
        .iz31(odontograma.getIz31())
        .iz32(odontograma.getIz32())
        .iz33(odontograma.getIz33())
        .iz34(odontograma.getIz34())
        .iz35(odontograma.getIz35())
        .iz36(odontograma.getIz36())
        .iz37(odontograma.getIz37())
        .iz38(odontograma.getIz38())
        .id41(odontograma.getId41())
        .id42(odontograma.getId42())
        .id43(odontograma.getId43())
        .id44(odontograma.getId44())
        .id45(odontograma.getId45())
        .id46(odontograma.getId46())
        .id47(odontograma.getId47())
        .id48(odontograma.getId48())
        .paciente_id(odontograma.getPaciente_id())
        .build();
  }
}
