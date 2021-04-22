package com.springboot.jpa_hibernate.model.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "tb_consumo")
public class Consumo {
    @Id
    @GeneratedValue
    private Long id;
    private Date dataHora;

    /* Realacionamento ManyToOne - Consumo - Feedback */

    @ManyToOne (cascade = CascadeType.ALL)
    private Feedback feedback;

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    @ManyToOne (cascade = CascadeType.ALL)
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @ManyToOne (cascade = CascadeType.ALL)
    private Conteudo conteudo;

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String toString (){
        return dataHora + ", " + id;

    }
}
