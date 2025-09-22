package tn.esprit.spring.studycasebi.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Composant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;



    public Composant() {}
    public Composant(String nomComposant, Float prix) {
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    // Getters & setters
    public Long getIdComposant() {
        return idComposant;

    }
    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }
    public String getNomComposant() {
        return nomComposant;
    }
    public void setNomComposant(String nomComposant) {

    }
    public Float getPrix() {
        return prix;
    }
    public void setPrix(Float prix) {
        this.prix = prix;
    }

}
