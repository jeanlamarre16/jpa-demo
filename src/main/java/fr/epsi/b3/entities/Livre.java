package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.Set;

@Table(name="LIVRE")
@Entity
public class Livre {

    @Column(name="ID")
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="TITRE")
    private String titre;

    @Column(name="AUTEUR")
    private String auteur;

    //@ManyToMany(mappedBy = "livres")
    //private Set<Client> clients;

    @ManyToMany(mappedBy = "livres")
    private Set<Emprunt> emprunts;

    public Livre() { }

    public Livre(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

     //public Set<Client> getClients() {
        //return clients;
    //}

    //public void setClients(Set<Client> clients) {
       // this.clients = clients;
    //}

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre : {" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
