package fr.epsi.b3;

import fr.epsi.b3.entities.Livre;
import javax.persistence.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        System.out.println("------------ Insertion ---------------");
        entityTransaction.begin();
        Livre livreAinserer = new Livre();
        livreAinserer.setTitre("titre du livre");
        livreAinserer.setAuteur("le nom de l'auteur");
        entityManager.persist(livreAinserer);
        System.out.println("insertion => " + livreAinserer.getId());

        // Suppression d'un livre
        /*Livre livreAsupprimer = entityManager.find(Livre.class, 9);
        if (livreAsupprimer != null){
            entityManager.remove(livreAsupprimer);
            System.out.println("Suppression livre => " + livreAsupprimer.getId());
        }*/

        // Récupérer un livre par son id
        System.out.println("\n----------- ID - Find -------------");
        Livre livreArecuperer = entityManager.find(Livre.class, 5);
        if (livreArecuperer != null) {
            System.out.println(livreArecuperer);
        }

        // Récupérer un  livre par son titre
        System.out.println("\n----------- Filtrage par TITRE - JPQL ------------");
        List<Livre> livreParTitre = entityManager.createQuery("SELECT livre from Livre livre where livre.titre = ?1")
                .setParameter(1, "Germinal")
                .getResultList();
        System.out.println(livreParTitre);
        // ou
        TypedQuery<Livre> query = entityManager.createQuery("SELECT livre from Livre livre where livre.titre = 'Germinal'", Livre.class);
        Livre livre = query.getResultList().get(0);
        System.out.println(livre);

        // Récupérer la liste de tous les livres
        System.out.println("\n----------- Select ALL -------------");
        List<Livre> livres = entityManager.createQuery("SELECT livre from Livre livre ")
                .getResultList();
        System.out.println(livres +"\n");

        entityTransaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}