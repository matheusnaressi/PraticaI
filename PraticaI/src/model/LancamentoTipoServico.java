package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idlancamentotiposervico", sequenceName = "idlancamentotiposervico",
        allocationSize = 1)
public class LancamentoTipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idlancamentotiposervico")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idlancamentotiposervico")
    private int idlancamentotiposervico;
    private int lancamentoordem_idlancamentoordem;
    private int tiposervico_idtiposervico;
    private String tiposervico_quantidade;
    private double tiposervico_valorunitario;
    private String descricaoservico;

    public String getDescricaoservico() {
        return descricaoservico;
    }

    public void setDescricaoservico(String descricaoservico) {
        this.descricaoservico = descricaoservico;
    }

    public int getIdlancamentotiposervico() {
        return idlancamentotiposervico;
    }

    public String getTiposervico_quantidade() {
        return tiposervico_quantidade;
    }

    public void setTiposervico_quantidade(String tiposervico_quantidade) {
        this.tiposervico_quantidade = tiposervico_quantidade;
    }

    public double getTiposervico_valorunitario() {
        return tiposervico_valorunitario;
    }

    public void setTiposervico_valorunitario(double tiposervico_valorunitario) {
        this.tiposervico_valorunitario = tiposervico_valorunitario;
    }

    public void setIdlancamentotiposervico(int idlancamentotiposervico) {
        this.idlancamentotiposervico = idlancamentotiposervico;
    }

    public int getLancamentoordem_idlancamentoordem() {
        return lancamentoordem_idlancamentoordem;
    }

    public void setLancamentoordem_idlancamentoordem(int lancamentoordem_idlancamentoordem) {
        this.lancamentoordem_idlancamentoordem = lancamentoordem_idlancamentoordem;
    }

    public int getTiposervico_idtiposervico() {
        return tiposervico_idtiposervico;
    }

    public void setTiposervico_idtiposervico(int tiposervico_idtiposervico) {
        this.tiposervico_idtiposervico = tiposervico_idtiposervico;
    }

}
