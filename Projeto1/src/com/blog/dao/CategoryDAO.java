package com.blog.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoryDAO {

	   private EntityManagerFactory emf; 

       /* se vc já está acostumado com Hibernate
        * a ideia é a mesma do método de fabrica que
        * criamos para os Session que vem do SessionFactory
        * Aqui temos apenas nomeclatura diferente, pense assim.
        */
       public EntityManager getEntityManager(){

               //responsavel pela persistencia
               return emf.createEntityManager();
       }
       public DAO() {
               //chamo ele de reprodutor da instância
               emf = Persistence.createEntityManagerFactory("sistemas");

               /* o nome passado vem do arquivo persistence.xml que contém as configs
                * para conexão com o BD.
                */
       }
}
