package com.samuel.barbearia.service;

import com.samuel.barbearia.domain.Servico;
import com.samuel.barbearia.mapper.ServicoMapper;
import com.samuel.barbearia.repository.ServicoRepository;
import com.samuel.barbearia.requests.ServicoPostRequestBody;
import com.samuel.barbearia.requests.ServicoPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public List<Servico> findAll (){
        return servicoRepository.findAll();
    }

    public Servico findById (Long id){
        return servicoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime not found"));
    }

    public Servico save (ServicoPostRequestBody servicoPostRequestBody){
        return servicoRepository.save(ServicoMapper.INSTANCE.toServico(servicoPostRequestBody));
    }

    public void delete (Long id){
         servicoRepository.delete(this.findById(id));
    }

    public Servico replace (ServicoPutRequestBody servicoPutRequestBody){
        return servicoRepository.save(ServicoMapper.INSTANCE.toServico1(servicoPutRequestBody));
    }

}
