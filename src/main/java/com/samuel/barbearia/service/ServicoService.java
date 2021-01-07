package com.samuel.barbearia.service;

import com.samuel.barbearia.domain.Servico;
import com.samuel.barbearia.mapper.ServicoMapper;
import com.samuel.barbearia.repository.ServicoRepository;
import com.samuel.barbearia.requests.ServicoPostRequestBody;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public List<Servico> findAll (){
        return servicoRepository.findAll();
    }

    public Servico save (ServicoPostRequestBody servicoPostRequestBody){
        return servicoRepository.save(ServicoMapper.INSTANCE.toServico(servicoPostRequestBody));
    }

    public Optional<Servico> findById (Long id){
        return servicoRepository.findById(id);
    }
}
