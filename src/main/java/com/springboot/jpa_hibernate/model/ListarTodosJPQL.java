package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ListarTodosJPQL {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Query query = manager.createQuery("from Usuario");
        List <Usuario> usuarios = query.getResultList();
        for (Usuario u: usuarios){
            System.out.println(u);
        }
        manager.close();
        JPAUtil.close();
    }
}
