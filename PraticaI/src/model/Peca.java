package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idpeca", sequenceName = "idpeca",
        allocationSize = 1)
public class Peca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idpeca")
    private int idpeca;
    private String descricaopeca;
    private int quantidade;
    private double valor_praticado;

    public int getIdpeca() {
        return idpeca;
    }

    public void setIdpeca(int idpeca) {
        this.idpeca = idpeca;
    }

    public String getDescricaopeca() {
        return descricaopeca;
    }

    public void setDescricaopeca(String descricaopeca) {
        this.descricaopeca = descricaopeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_praticado() {
        return valor_praticado;
    }

    public void setValor_praticado(double valor_praticado) {
        this.valor_praticado = valor_praticado;
    }

}
