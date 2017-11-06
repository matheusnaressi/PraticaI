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

    @Override
    public String toString() {
        return nomemodelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idmodeloveiculo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModeloVeiculo other = (ModeloVeiculo) obj;
        if (this.idmodeloveiculo != other.idmodeloveiculo) {
            return false;
        }
        return true;
    }
    
    
    

    
}
