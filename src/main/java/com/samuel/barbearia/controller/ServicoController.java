package com.samuel.barbearia.controller;

import com.samuel.barbearia.domain.Servico;
import com.samuel.barbearia.repository.ServicoRepository;
import com.samuel.barbearia.requests.ServicoPostRequestBody;
import com.samuel.barbearia.service.ServicoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("servicos")
@RequiredArgsConstructor
public class ServicoController {

    private final ServicoService servicoService;

    @GetMapping
    private ResponseEntity<List<Servico>> findAll (){
        return new ResponseEntity<>(servicoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Servico> save (@RequestBody ServicoPostRequestBody servicoPostRequestBody){
        return new ResponseEntity<>(servicoService.save(servicoPostRequestBody), HttpStatus.OK);
    }

}
