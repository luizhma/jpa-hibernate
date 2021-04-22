package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Usuario;

import javax.persistence.EntityManager;

public class TesteBuscaPorIdComFind {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u = manager.find(Usuario.class, 1L);
        System.out.println(u);
        manager.close();
        JPAUtil.close();
    }
}
