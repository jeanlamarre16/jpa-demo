package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.List;

public class TestJPA {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       // EntityTransaction entityTransaction=entityManager.getTransaction();

        System.out.println("----------- Select ALL -------------");
        List<Livre> livres = entityManager.createQuery("SELECT livre from Livre livre ")
                .getResultList();
        System.out.println(livres +"\n");

        /* entityTransaction.commit(); */
        entityManager.close();
        entityManagerFactory.close();
    }
}
