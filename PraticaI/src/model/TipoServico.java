package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idtiposervico", sequenceName = "idtiposervico",
        allocationSize = 1)
public class TipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idtiposervico")
    private int idtiposervico;
    private String descricaoservico;

    public int getIdtiposervico() {
        return idtiposervico;
    }

    public void setIdtiposervico(int idtiposervico) {
        this.idtiposervico = idtiposervico;
    }

    public String getDescricaoservico() {
        return descricaoservico;
    }

    public void setDescricaoservico(String descricaoservico) {
        this.descricaoservico = descricaoservico;
    }

}
