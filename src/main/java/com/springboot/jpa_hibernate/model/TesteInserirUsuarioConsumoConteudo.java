package com.springboot.jpa_hibernate.model;

import com.springboot.jpa_hibernate.model.bean.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteInserirUsuarioConsumoConteudo {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Usuario u = new Usuario();
        u.setNome("Pedro");
        u.setFone("1321321");
        u.setEmail("pedro@gmail");
        Perfil p = new Perfil();
        p.setDescricao("Perfil do Pedro");
        p.setUsuario(u);
        u.setPerfil(p);
        Conteudo conteudo = new Conteudo();
        conteudo.setDescricao("Conteúdo de vídeo");
        conteudo.setTipo("Tipo vídeo");
        Consumo consumo = new Consumo();
        Feedback feedback = new Feedback();
        feedback.setDescricao("Curti");
        consumo.setUsuario(u);
        consumo.setDataHora(new Date());
        consumo.setConteudo(conteudo);
        consumo.setFeedback(feedback);
        manager.persist(consumo);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
