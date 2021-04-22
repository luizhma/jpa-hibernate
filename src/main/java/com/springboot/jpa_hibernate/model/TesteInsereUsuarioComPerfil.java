package com.springboot.jpa_hibernate.model;


import com.springboot.jpa_hibernate.model.bean.Perfil;
import com.springboot.jpa_hibernate.model.bean.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUsuarioComPerfil {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Perfil p = new Perfil();
        p.setDescricao("Perfil do José");
        manager.persist(p);
        Usuario u = new Usuario();
        u.setNome("Jose");
        u.setFone("1321312");
        u.setEmail("jose@gmail.com");
        u.setPerfil(p);
        manager.persist(u);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
