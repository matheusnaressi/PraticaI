package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idvalorpeca", sequenceName = "idvalorpeca",
        allocationSize = 1)
public class ValorPeca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idvalorpeca")
    private int idvalorpeca;
    private int peca_idpeca;
    private String valorunitario;
    private int quantidadetipo;
    private Date dataentrada;

    public int getIdvalorpeca() {
        return idvalorpeca;
    }

    public void setIdvalorpeca(int idvalorpeca) {
        this.idvalorpeca = idvalorpeca;
    }

    public int getPeca_idpeca() {
        return peca_idpeca;
    }

    public void setPeca_idpeca(int peca_idpeca) {
        this.peca_idpeca = peca_idpeca;
    }

    public String getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(String valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getQuantidadetipo() {
        return quantidadetipo;
    }

    public void setQuantidadetipo(int quantidadetipo) {
        this.quantidadetipo = quantidadetipo;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

}
