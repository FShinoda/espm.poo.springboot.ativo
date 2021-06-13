package br.espm.springboot.ativo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmpresaRepository extends CrudRepository<EmpresaModel, String>{

    @Override
    Iterable<EmpresaModel> findAll();

    @Override
    Optional<EmpresaModel> findById(String s);

    @Query("SELECT e from EmpresaModel e WHERE UPPER(e.txSimbolo) = UPPER(:simbolo)")
    Optional<EmpresaModel> findBySimbolo(@Param("simbolo") String simbolo);
    
}
