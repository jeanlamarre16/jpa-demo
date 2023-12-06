package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.Set;

//@Entity(name="CLIENT")
public class Client {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Integer id;

    //@Column(name="NOM")
    private String nom;

    //@Column(name="PRENOM")
    private String prenom;

    //@OneToMany(mappedBy ="client" )
    private Set<Emprunt> emprunts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(Set<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
