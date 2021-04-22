package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Feedback;

import javax.persistence.EntityManager;

public class TesteBuscaOneToMany {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Feedback f = manager.find(Feedback.class, 3L);
        System.out.println(f.getConsumos());
        manager.close();
        JPAUtil.close();
    }
}

