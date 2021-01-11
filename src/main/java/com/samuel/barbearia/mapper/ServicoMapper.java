package com.samuel.barbearia.mapper;

import com.samuel.barbearia.domain.Servico;
import com.samuel.barbearia.requests.ServicoPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ServicoMapper {

    public static final ServicoMapper  INSTANCE = Mappers.getMapper( ServicoMapper .class );
    public abstract  Servico toServico(ServicoPostRequestBody servicoPostRequestBody);
}
