package com.springboot.jpa_hibernate.model.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "tb_feedback")
public class Feedback {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

    /* Relacionamento OneToMany - Feedback - Consumo */

    @OneToMany (mappedBy = "feedback", cascade = CascadeType.ALL)
    private List<Consumo> consumos;

    public List<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumo> consumos) {
        this.consumos = consumos;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
