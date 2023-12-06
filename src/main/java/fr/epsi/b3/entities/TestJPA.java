package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.List;

public class TestJPA {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       // EntityTransaction entityTransaction=entityManager.getTransaction();

        System.out.println("----------- Select ALL- Livre -------------");
        List<Livre> livres = entityManager.createQuery("SELECT livre from Livre livre ")
                .getResultList();
        System.out.println(livres +"\n");

        System.out.println("----------- Select By Title - Livre + Emprunt -------------");
        TypedQuery<Livre> query = entityManager.createQuery("SELECT livre from Livre livre where livre.titre = 'Germinal'", Livre.class);
        Livre livre = query.getResultList().get(0);
        System.out.println(livre.getEmprunts());

        System.out.println("\n----------- Select By Title - Livre + Les Clients -------------");
        /* entityTransaction.commit(); */
        entityManager.close();
        entityManagerFactory.close();
    }
}
