package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "iditensordem", sequenceName = "iditensordem",
        allocationSize = 1)
public class ItensOrdem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "iditensordem")
    private int iditensordem;
    private int peca_idpeca;
    private int lancamentoordem_idlancamentoordem;
    private int quantidade;
    private String descricao;
    private double valorunitario;

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIditensordem() {
        return iditensordem;
    }

    public void setIditensordem(int iditensordem) {
        this.iditensordem = iditensordem;
    }

    public int getPeca_idpeca() {
        return peca_idpeca;
    }

    public void setPeca_idpeca(int peca_idpeca) {
        this.peca_idpeca = peca_idpeca;
    }

    public int getLancamentoordem_idlancamentoordem() {
        return lancamentoordem_idlancamentoordem;
    }

    public void setLancamentoordem_idlancamentoordem(int lancamentoordem_idlancamentoordem) {
        this.lancamentoordem_idlancamentoordem = lancamentoordem_idlancamentoordem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
