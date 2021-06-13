package br.espm.springboot.ativo;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.espm.springboot.ativo.common.datatype.Ativo;

@Component
public class AtivoService {

    @Autowired
    private EmpresaService empresaService;

    @Autowired 
    private AtivoRepository ativoRepository;


    public Ativo findById(String id){
        return fill(
                ativoRepository
                        .findById(id)
                        .map(AtivoModel::to)
                        .orElse(null)
        );
    }

    public Ativo findBy(String idEmpresa, Date data) {
        Ativo ativo = ativoRepository
                .listByEmpresaData(idEmpresa, data).stream()
                .map(AtivoModel::to)
                .findFirst()
                .orElse(null);
        // relacionamento
        return fill(ativo);            
    }

    public List<Ativo> listBy(String idEmpresa, Date dtInicio, Date dtFim) {
        return ativoRepository
                .listBy(idEmpresa, dtInicio, dtFim).stream()
                .map(AtivoModel::to)
                .collect(Collectors.toList());
    }

    private Ativo fill(Ativo a) {
        if (a != null) {
            a.setEmpresa(empresaService.findBy(UUID.fromString(a.getEmpresa().getId())));
        }
        return a;
    }
    
}
