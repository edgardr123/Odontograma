package com.example.odontograma.DTO;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Builder
    public class OdontogramaDTO {

        // Superior Derecha
        private String SD11;
        private String SD12;
        private String SD13;
        private String SD14;
        private String SD15;
        private String SD16;
        private String SD17;
        private String SD18;

        // Superior Izquierda
        private String SI21;
        private String SI22;
        private String SI23;
        private String SI24;
        private String SI25;
        private String SI26;
        private String SI27;
        private String SI28;

        // Inferior Izquierda
        private String IZ31;
        private String IZ32;
        private String IZ33;
        private String IZ34;
        private String IZ35;
        private String IZ36;
        private String IZ37;
        private String IZ38;

        // Inferior Derecha
        private String ID41;
        private String ID42;
        private String ID43;
        private String ID44;
        private String ID45;
        private String ID46;
        private String ID47;
        private String ID48;

        public static OdontogramaDTO build(String SD11,
                                           String SD12,
                                           String SD13,
                                           String SD14,
                                           String SD15,
                                           String SD16,
                                           String SD17,
                                           String SD18,
                                           String SI21,
                                           String SI22,
                                           String SI23,
                                           String SI24,
                                           String SI25,
                                           String SI26,
                                           String SI27,
                                           String SI28,
                                           String IZ31,
                                           String IZ32,
                                           String IZ33,
                                           String IZ34,
                                           String IZ35,
                                           String IZ36,
                                           String IZ37,
                                           String IZ38,
                                           String ID41,
                                           String ID42,
                                           String ID43,
                                           String ID44,
                                           String ID45,
                                           String ID46,
                                           String ID47,
                                           String ID48) {
            return OdontogramaDTO.builder().
                    SD11(SD11).
                    SD12(SD12).
                    SD13(SD13).
                    SD14(SD14).
                    SD15(SD15).
                    SD16(SD16).
                    SD17(SD17).
                    SD18(SD18).
                    SI21(SI21).
                    SI22(SI22).
                    SI23(SI23).
                    SI24(SI24).
                    SI25(SI25).
                    SI26(SI26).
                    SI27(SI27).
                    SI28(SI28).
                    IZ31(IZ31).
                    IZ32(IZ32).
                    IZ33(IZ33).
                    IZ34(IZ34).
                    IZ35(IZ35).
                    IZ36(IZ36).
                    IZ37(IZ37).
                    IZ38(IZ38).
                    ID41(ID41).
                    ID42(ID42).
                    ID43(ID43).
                    ID44(ID44).
                    ID45(ID45).
                    ID46(ID46).
                    ID47(ID47).
                    ID48(ID48)
                    .build();
        }
    }

