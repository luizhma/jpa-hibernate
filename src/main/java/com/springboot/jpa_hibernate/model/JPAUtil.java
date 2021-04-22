package com.springboot.jpa_hibernate.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory factory;
    //bloco inicializador estático

    static {
        factory = Persistence.createEntityManagerFactory("usjtPU");
    }
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
    public static void close () {
        factory.close();
    }
}
