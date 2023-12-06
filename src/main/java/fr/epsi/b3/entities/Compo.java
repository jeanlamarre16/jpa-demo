package fr.epsi.b3.entities;

import javax.persistence.*;
import java.util.Set;

//@Entity(name="COMPO")
public class Compo {
  /*  @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Integer id;

    //@Column(name="ID_LIV")
    private Integer idLivre;

    //@Column(name="ID_EMP")
    private Integer idEmprunt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    //@ManyToOne
    private Livre livre;
    public Compo() { }

    public Compo(Integer idLivre, Integer idEmprunt) {
        this.idLivre = idLivre;
        this.idEmprunt = idEmprunt;
    }

    public Integer getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Integer idLivre) {
        this.idLivre = idLivre;
    }

    public Integer getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(Integer idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    @Override
    public String toString() {
        return "Compo{" +
                "id=" + id +
                ", idLivre=" + idLivre +
                ", idEmprunt=" + idEmprunt +
                '}';
    }
}
