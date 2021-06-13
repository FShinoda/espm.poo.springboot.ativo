package br.espm.springboot.ativo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AtivoRepository extends CrudRepository<AtivoModel, String>{

    @Override
    Iterable<AtivoModel> findAll();

    @Override
    Optional<AtivoModel> findById(String s);

    @Query("SELECT a from AtivoModel a WHERE a.idEmpresa = :idEmpresa AND a.dtData <= :data ORDER BY a.dtData DESC")
    List<AtivoModel> listByEmpresaData(
            @Param("idEmpresa") String idEmpresa,
            @Param("data") Date data);

    @Query("SELECT a FROM AtivoModel a " +
            "WHERE " +
            "(a.idEmpresa is null or a.idEmpresa = :idEmpresa) AND " +
            "(a.dtData is null or a.dtData >= :dtInicio) AND " +
            "(a.dtData is null or a.dtData <= :dtFim)"
    )
    List<AtivoModel> listBy(
            @Param("idEmpresa") String idEmpresa,
            @Param("dtInicio") Date dtInicio,
            @Param("dtFim") Date dtFim
    );
    
}
