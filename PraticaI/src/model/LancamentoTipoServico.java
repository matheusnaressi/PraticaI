package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idlancamentotiposervico", sequenceName = "idlancamentotiposervico",
        allocationSize = 1)
public class LancamentoTipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idlancamentotiposervico")
    private int idlancamentotiposervico;
    private int lancamentoordem_idlancamentoordem;
    private int tiposervico_idtiposervico;

    public int getIdlancamentotiposervico() {
        return idlancamentotiposervico;
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
