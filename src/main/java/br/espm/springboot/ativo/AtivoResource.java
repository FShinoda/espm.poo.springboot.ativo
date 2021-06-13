package br.espm.springboot.ativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.espm.springboot.ativo.common.controller.AtivoController;
import br.espm.springboot.ativo.common.datatype.Ativo;
import br.espm.springboot.ativo.common.datatype.Empresa;

@RestController
public class AtivoResource implements AtivoController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private AtivoService ativoService;

    @Override
    public List<Empresa> listEmpresas() {
        // Acessar database aqui
        return empresaService.listAll();
    }

    @Override
    public Empresa listEmpresas(@PathVariable String simbolo) {
        return empresaService.findBySimbolo(simbolo);
    }

    @Override
    public Ativo getAtivo(@PathVariable String id) {
        return ativoService.findById(id);
    }

    @Override
    public Ativo ativo(String simbolo, String data) {
        try {
            Empresa empresa = empresaService.findBySimbolo(simbolo);
            if (empresa == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, simbolo + " not found");
            }
            System.out.println(data);
            System.out.println(sdf.parse(data));
            return ativoService.findBy(empresa.getId(), sdf.parse(data));
        } catch (ParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @Override
    public List<Ativo> listAtivos(
            @RequestParam String simbolo,
            @RequestParam String ini,
            @RequestParam String fim) {

        try {
            Empresa empresa = empresaService.findBySimbolo(simbolo);
            if (empresa == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, simbolo + " not found");
            }
            Date dtInicio = ini == null ? null : sdf.parse(ini);
            Date dtTermino = fim == null ? null : sdf.parse(fim);
            return ativoService.listBy(empresa.getId(), dtInicio, dtTermino);
        } catch (ParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
    
}
