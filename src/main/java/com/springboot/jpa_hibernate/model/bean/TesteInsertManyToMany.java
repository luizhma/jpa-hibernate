package com.springboot.jpa_hibernate.model.bean;

import com.springboot.jpa_hibernate.model.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
/*
public class TesteInsertManyToMany {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        List<Conteudo> conteudos = new ArrayList<>();
        Conteudo c1 = new Conteudo();
        c1.setDescricao("Conteudo 1");
        c1.setTipo("Tipo 1 ");
        Conteudo c2 = new Conteudo();
        c2.setDescricao("Conteudo 2");
        c2.setTipo("Tipo 2");
        conteudos.add(c1);
        conteudos.add(c2);
        Usuario u1 = new Usuario();
        Perfil perfil = new Perfil();
        u1.setNome("Luiz Henrique");
        u1.setEmail("Luiz@gmail.com");
        u1.setFone("123456");
        u1.setPerfil(perfil);
        u1.setConteudos(conteudos);
        perfil.setDescricao("Perfil do Luiz");
        perfil.setUsuario(u1);
        List <Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        c1.setUsuarios(usuarios);
        c2.setUsuarios(usuarios);
        manager.persist(u1);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
*/