package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idveiculo", sequenceName = "idveiculo",
        allocationSize = 1)
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idveiculo")
    private int idveiculo;
    private int modeloveiculo_idmodeloveiculo;
    private int pessoa_id;
    private int idmodeloveiculo;
    private String placaveiculo;

    public int getIdveiculo() {
        return idveiculo;
    }

    public void setIdveiculo(int idveiculo) {
        this.idveiculo = idveiculo;
    }

    public int getModeloveiculo_idmodeloveiculo() {
        return modeloveiculo_idmodeloveiculo;
    }

    public void setModeloveiculo_idmodeloveiculo(int modeloveiculo_idmodeloveiculo) {
        this.modeloveiculo_idmodeloveiculo = modeloveiculo_idmodeloveiculo;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public int getIdmodeloveiculo() {
        return idmodeloveiculo;
    }

    public void setIdmodeloveiculo(int idmodeloveiculo) {
        this.idmodeloveiculo = idmodeloveiculo;
    }

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

}
