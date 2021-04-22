package com.springboot.jpa_hibernate.model.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "_TBUSUARIO")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, length = 200)
    private String nome;
    @Column (nullable = false, length = 30)
    private String fone;
    @Column (nullable = false, length = 100)
    private String email;

    /* Relacionamento 1 to 1 */
    @OneToOne (optional = false, cascade = CascadeType.ALL)
    @JoinColumn (name = "id_do_meu_perfil")
    private Perfil perfil;

    public Perfil getPerfil(){
        return perfil;
    }
    public void setPerfil (Perfil perfil){
        this.perfil = perfil;
    }

    /* Relacionamento ManyToMany - Usuário - Conteúdo
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (name = "tb_usuario_conteudo",
    joinColumns = @JoinColumn (name = "id_usuario"), inverseJoinColumns = @JoinColumn (name = "id_consumo"))
    private List<Conteudo> conteudos;

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
     */

    @OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Consumo> consumos;

    public List<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumo> consumos) {
        this.consumos = consumos;
    }

    /* Getters and Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Usuario [id_usuario: " + id + ",\n" + " nome: " + nome + ",\n" + " telefone: "
                + fone + ",\n" + " email: " + email + ",\n" + perfil + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result  = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}

