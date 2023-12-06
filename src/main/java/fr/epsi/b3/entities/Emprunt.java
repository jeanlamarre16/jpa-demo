package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//@Entity(name="EMPRUNT")
public class Emprunt {

    //@Id
    //@Column(name="ID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column(name="DATE_DEBUT")
    private Date dateDebut;

    //@Column(name="DATE_FIN")
    private Date dateFin;

    //@Column(name="DELAI")
    private Integer delai;

    //@Column(name="ID_CLIENT")
    private Integer idClient;

    /*@ManyToMany
    @JoinTable(name="COMPO",
        joinColumns = @JoinColumn(name="ID_EMPRUNT", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name="ID_LIVRE", referencedColumnName = "ID")
    )*/
    private Set<Livre> livres;

    /*@ManyToOne
    @JoinColumn(name="ID_CLIENT") */
    private Client client;

    public Emprunt() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
