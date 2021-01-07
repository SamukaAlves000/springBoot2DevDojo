package com.samuel.barbearia.mapper;

import com.samuel.barbearia.domain.Servico;
import com.samuel.barbearia.requests.ServicoPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServicoMapper {

    ServicoMapper  INSTANCE = Mappers.getMapper( ServicoMapper .class );
    Servico toServico(ServicoPostRequestBody servicoPostRequestBody);
}
