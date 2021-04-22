package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.Consumo;
import com.springboot.jpa_hibernate.model.bean.Feedback;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteInsereDoisConsumosUmFeedback {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Feedback f = new Feedback();
        f.setDescricao("Curti");
        List <Consumo> consumos = new ArrayList<>();
        Consumo c1 = new Consumo();
        c1.setDataHora(new Date());
        c1.setFeedback(f);
        Consumo c2 = new Consumo();
        c2.setDataHora(new Date());
        c2.setFeedback(f);
        consumos.add(c1);
        consumos.add(c2);
        f.setConsumos(consumos);
        manager.persist(f);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
