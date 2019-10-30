package com.carros.api.classes;

import lombok.Data;
import org.modelmapper.ModelMapper;
@Data
public class ClasseDTO {
    private Long id;
    private String nome_classe;
    private String created;
    private String tipo;


    public static ClasseDTO create(Classe classe) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(classe, ClasseDTO.class);
    }

}
