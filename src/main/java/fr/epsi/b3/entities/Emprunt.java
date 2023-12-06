package fr.epsi.b3.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity(name="EMPRUNT")
public class Emprunt {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="DATE_DEBUT")
    private LocalDate dateDebut;

    @Column(name="DATE_FIN")
    private LocalDate dateFin;

    @Column(name="DELAI")
    private Integer delai;

    @Column(name="ID_CLIENT")
    private Integer idClient;

    @ManyToMany
    @JoinTable(name="COMPO",
        joinColumns = @JoinColumn(name="ID_EMP", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name="ID_LIV", referencedColumnName = "ID")
    )
    private Set<Livre> livres;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT", insertable = false, updatable = false)
    private Client client;

    // ========= Constructeurs ============

    public Emprunt() { }

    // ============ Getters ===============

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public Integer getDelai() {
        return delai;
    }
    public Integer getIdClient() {
        return idClient;
    }
    public Client getClient() {
        return client;
    }
    public Set<Livre> getLivres() {
        return livres;
    }

    // ============ Setters ===============

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
    public void setDelai(Integer delai) {
        this.delai = delai;
    }
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    // ============ toString ===============

    @Override
    public String toString() {
        return "\n{" +
                "Code emprunt =" + id +
                ", | Identifiant client = " + idClient +
                ", | Nom client = " + client.getNom() +
                ", | Date début = " + dateDebut +
                ", | Date fin = " + dateFin +
                ", | Delai = " + delai +
                " jours" +
                ", \nlivres empruntés = " + livres +
                '}'+"\n";
    }
}
