package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idmodeloveiculo", sequenceName = "idmodeloveiculo",
        allocationSize = 1)
public class ModeloVeiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idmodeloveiculo")
    private int idmodeloveiculo;
    private String nomemodelo;
    private int anomodelo;

    public int getIdmodeloveiculo() {
        return idmodeloveiculo;
    }

    public void setIdmodeloveiculo(int idmodeloveiculo) {
        this.idmodeloveiculo = idmodeloveiculo;
    }

    public String getNomemodelo() {
        return nomemodelo;
    }

    public void setNomemodelo(String nomemodelo) {
        this.nomemodelo = nomemodelo;
    }

    public int getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }


}
