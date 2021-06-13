package br.espm.springboot.ativo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import br.espm.springboot.ativo.common.datatype.Ativo;
import br.espm.springboot.ativo.common.datatype.Empresa;

@Entity
@Table(name = "ativo")
public class AtivoModel {

    @Id
    @Column(name = "atvCodi")
    private String idAtivo;

    @Column(name = "empCodi")
    private String idEmpresa;

    @Column(name = "atvData")
    private Date dtData;

    @Column(name = "atvValor")
    private BigDecimal vrValor;

    public AtivoModel(){} // Contrutor vazio

    public AtivoModel(Ativo a){
        this.idAtivo = a.getId();
        this.idEmpresa = a.getEmpresa().getId();
        this.dtData = a.getData();
        this.vrValor = a.getValor();
    }

    public Ativo to(){
        Empresa e = new Empresa();
        e.setId(idEmpresa);

        Ativo a = new Ativo();
        a.setId(idAtivo);
        a.setEmpresa(e);
        a.setData(dtData);
        a.setValor(vrValor);
        return a;
    }
    
}
