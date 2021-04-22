package com.springboot.jpa_hibernate.model.bean;



import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "tb_conteudo")
public class Conteudo {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private String tipo;

    /* Relacionamento ManyToMany - Usuário - Conteúdo
    @ManyToMany (mappedBy = "conteudos")
    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    */

    @OneToMany (mappedBy = "conteudo", cascade = CascadeType.ALL)
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
