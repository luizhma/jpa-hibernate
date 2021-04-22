package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Perfil;

import javax.persistence.EntityManager;

public class TesteBuscaPerfilComUsuarioAssociado {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Perfil p = manager.find(Perfil.class, 1L);
        System.out.println(p.getUsuario().getNome());
        manager.close();
        JPAUtil.close();
    }
}
