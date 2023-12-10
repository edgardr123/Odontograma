package com.example.odontograma.Entidad;

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
import lombok.Setter;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "pacientes_odontograma")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Odontograma implements Serializable{

    private static final long serialVersionUID = 1L;
//TODO Cambiar string a byte
    // Superior Derecha

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SD11")
    private String SD11;
    @Column(name = "SD12")
    private String SD12;
    @Column(name = "SD13")
    private String SD13;
    @Column(name = "SD14")
    private String SD14;
    @Column(name = "SD15")
    private String SD15;
    @Column(name = "SD16")
    private String SD16;
    @Column(name = "SD17")
    private String SD17;
    @Column(name = "SD18")
    private String SD18;
//TODO
    // Superior Izquierda
    @Column(name = "SI21")
    private String SI21;
    @Column(name = "SI22")
    private String SI22;
    @Column(name = "SI23")
    private String SI23;
    @Column(name = "SI24")
    private String SI24;
    @Column(name = "SI25")
    private String SI25;
    @Column(name = "SI26")
    private String SI26;
    @Column(name = "SI27")
    private String SI27;
    @Column(name = "SI28")
    private String SI28;

    // Inferior Izquierda
    @Column(name = "IZ31")
    private String IZ31;
    @Column(name = "IZ32")
    private String IZ32;
    @Column(name = "IZ33")
    private String IZ33;
    @Column(name = "IZ34")
    private String IZ34;
    @Column(name = "IZ35")
    private String IZ35;
    @Column(name = "IZ36")
    private String IZ36;
    @Column(name = "IZ37")
    private String IZ37;
    @Column(name = "IZ38")
    private String IZ38;

    // Inferior Derecha
    @Column(name = "ID41")
    private String ID41;
    @Column(name = "ID42")
    private String ID42;
    @Column(name = "ID43")
    private String ID43;
    @Column(name = "ID44")
    private String ID44;
    @Column(name = "ID45")
    private String ID45;
    @Column(name = "ID46")
    private String ID46;
    @Column(name = "ID47")
    private String ID47;
    @Column(name = "ID48")
    private String ID48;

    public Odontograma(String sD11, String sD12, String sD13, String sD14, String sD15,
                               String sD16, String sD17, String sD18, String sI21, String sI22, String sI23, String sI24, String sI25,
                               String sI26, String sI27, String sI28, String iZ31, String iZ32, String iZ33, String iZ34, String iZ35,
                               String iZ36, String iZ37, String iZ38, String iD41, String iD42, String iD43, String iD44, String iD45,
                               String iD46, String iD47, String iD48) {


        SD11 = sD11;
        SD12 = sD12;
        SD13 = sD13;
        SD14 = sD14;
        SD15 = sD15;
        SD16 = sD16;
        SD17 = sD17;
        SD18 = sD18;
        SI21 = sI21;
        SI22 = sI22;
        SI23 = sI23;
        SI24 = sI24;
        SI25 = sI25;
        SI26 = sI26;
        SI27 = sI27;
        SI28 = sI28;
        IZ31 = iZ31;
        IZ32 = iZ32;
        IZ33 = iZ33;
        IZ34 = iZ34;
        IZ35 = iZ35;
        IZ36 = iZ36;
        IZ37 = iZ37;
        IZ38 = iZ38;
        ID41 = iD41;
        ID42 = iD42;
        ID43 = iD43;
        ID44 = iD44;
        ID45 = iD45;
        ID46 = iD46;
        ID47 = iD47;
        ID48 = iD48;
    }
}
