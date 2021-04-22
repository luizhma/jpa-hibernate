package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Perfil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

//não consigo remover um perfil com usuario
public class TesteRemovePerfilComUsuarioAssociado {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Perfil p = manager.find(Perfil.class, 1L);
        manager.remove(p);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
