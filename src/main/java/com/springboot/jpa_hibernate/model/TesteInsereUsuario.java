package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class TesteInsereUsuario {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Usuario u = new Usuario();
        u.setNome("Ana");
        u.setFone("964594162");
        u.setEmail("ana@gmail.com");
        manager.persist(u);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
