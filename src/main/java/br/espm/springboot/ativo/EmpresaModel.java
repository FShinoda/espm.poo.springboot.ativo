package br.espm.springboot.ativo;

import javax.persistence.*;

import br.espm.springboot.ativo.common.datatype.Empresa;

@Entity
@Table(name = "empresa")
public class EmpresaModel {

    @Id
    @Column(name = "empCodi")
    private String idEmpresa;

    @Column(name = "empNome")
    private String txNome;

    @Column(name = "empSimb")
    private String txSimbolo;


    public EmpresaModel(){} // Construtor vazio

    public EmpresaModel(Empresa e){
        this.idEmpresa = e.getId();
        this.txNome = e.getNome();
        this.txSimbolo = e.getSimbolo();

    }

    public Empresa to(){
        Empresa e = new Empresa();
        e.setId(idEmpresa);
        e.setNome(txNome);
        e.setSimbolo(txSimbolo);

        return e;
    }
    
}
