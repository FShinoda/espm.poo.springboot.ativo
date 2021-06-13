package br.espm.springboot.ativo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.espm.springboot.ativo.common.datatype.Empresa;

@Component
public class EmpresaService {

    @Autowired
    private EmpresaRepository moedaRepository;

    
    public List<Empresa> listAll() {
        return StreamSupport
                .stream(moedaRepository.findAll().spliterator(), false)
                .collect(Collectors.toList())
                .stream().map(EmpresaModel::to)
                .collect(Collectors.toList());
    }

    public Empresa findBy(UUID id) {
        return moedaRepository
                .findById(id.toString())
                .map(EmpresaModel::to)
                .orElse(null);
    }

    public Empresa findBySimbolo(String simbolo) {
        return moedaRepository
                .findBySimbolo(simbolo)
                .map(EmpresaModel::to)
                .orElse(null);
    }
    
}
