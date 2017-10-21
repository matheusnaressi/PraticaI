package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "idvalortiposervico", sequenceName = "idvalortiposervico",
        allocationSize = 1)
public class valorTipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idvalortiposervico")
    private int idvalortiposervico;
    private int tiposervico_idtiposervico;
    private Date dataentrada;
    private float valorsugerido;

    public int getIdvalortiposervico() {
        return idvalortiposervico;
    }

    public void setIdvalortiposervico(int idvalortiposervico) {
        this.idvalortiposervico = idvalortiposervico;
    }

    public int getTiposervico_idtiposervico() {
        return tiposervico_idtiposervico;
    }

    public void setTiposervico_idtiposervico(int tiposervico_idtiposervico) {
        this.tiposervico_idtiposervico = tiposervico_idtiposervico;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public float getValorsugerido() {
        return valorsugerido;
    }

    public void setValorsugerido(float valorsugerido) {
        this.valorsugerido = valorsugerido;
    }

   
}
