package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "iditensordem", sequenceName = "idlancamentoordem",
        allocationSize = 1)
public class lancamentoOrdem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idlancamentoordem")
    private int idlancamentoordem;
    private int pessoa_id;
    private int veiculo_idveiculo;
    private Date dataentrada;

    public int getIdlancamentoordem() {
        return idlancamentoordem;
    }

    public void setIdlancamentoordem(int idlancamentoordem) {
        this.idlancamentoordem = idlancamentoordem;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public int getVeiculo_idveiculo() {
        return veiculo_idveiculo;
    }

    public void setVeiculo_idveiculo(int veiculo_idveiculo) {
        this.veiculo_idveiculo = veiculo_idveiculo;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    
}
