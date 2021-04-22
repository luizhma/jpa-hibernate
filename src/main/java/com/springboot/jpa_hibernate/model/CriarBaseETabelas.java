package com.springboot.jpa_hibernate.model;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("usjtPU");
    }
}
