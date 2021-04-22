package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteAtualizarUsuario {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Usuario u = manager.find(Usuario.class, 1L);
        u.setNome(u.getNome() + "Da Silva");
        u.setEmail("ana@yahoo.com");
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
