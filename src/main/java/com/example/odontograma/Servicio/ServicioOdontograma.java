package com.example.odontograma.Servicio;

import com.example.odontograma.DTO.OdontogramaDTO;
import com.example.odontograma.DTO.PacienteDTO;
import com.example.odontograma.Entidad.Odontograma;
import com.example.odontograma.Repositorio.PacienteOdontogramaRepositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j

public class ServicioOdontograma {

    private final PacienteOdontogramaRepositorio pacienteOdontogramaRepositorio;

    /*public List<Paciente> ObtenerTodosLosPacientes(){
        //return pacienteRepositorio.findAll();
    }*/

    public Odontograma GuardarOdontograma(Odontograma odontograma) {
        return pacienteOdontogramaRepositorio.save(odontograma);
    }

    public OdontogramaDTO ObtenerOdontogramaId(Long id){
        final Odontograma odontograma = pacienteOdontogramaRepositorio.getById(id);
        return OdontogramaDTO.builder().SD11(odontograma.getSD11()).
                SD12(odontograma.getSD12()).
                SD13(odontograma.getSD13()).
                SD14(odontograma.getSD14()).
                SD15(odontograma.getSD15()).
                SD16(odontograma.getSD16()).
                SD17(odontograma.getSD17()).
                SD18(odontograma.getSD18()).
                SI21(odontograma.getSI21()).
                SI22(odontograma.getSI22()).
                SI23(odontograma.getSI23()).
                SI24(odontograma.getSI24()).
                SI25(odontograma.getSI25()).
                SI26(odontograma.getSI26()).
                SI27(odontograma.getSI27()).
                SI28(odontograma.getSI28()).
                IZ31(odontograma.getIZ31()).
                IZ32(odontograma.getIZ32()).
                IZ33(odontograma.getIZ33()).
                IZ34(odontograma.getIZ34()).
                IZ35(odontograma.getIZ35()).
                IZ36(odontograma.getIZ36()).
                IZ37(odontograma.getIZ37()).
                IZ38(odontograma.getIZ38()).
                ID41(odontograma.getID41()).
                ID42(odontograma.getID42()).
                ID43(odontograma.getID43()).
                ID44(odontograma.getID44()).
                ID45(odontograma.getID45()).
                ID46(odontograma.getID46()).
                ID47(odontograma.getID47()).
                ID48(odontograma.getID48())
                .build();
    }
}
