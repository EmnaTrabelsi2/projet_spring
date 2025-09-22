package tn.esprit.spring.studycasebi.entities;

import jakarta.persistence.*;

@Entity
public class DetailComposant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @ManyToOne
    private Composant composant;

    public DetailComposant() {}
    public DetailComposant(Float imc, TypeComposant typeComposant) {
        this.imc = imc;
        this.typeComposant = typeComposant;
    }

    // Getters & setters
    public Long getIdDetailComposant() {
        return idDetailComposant;
    }
    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }
    public Float getImc() {
        return imc;
    }
    public void setImc(Float imc) {
        this.imc = imc;
    }
    public TypeComposant getTypeComposant() {
        return typeComposant;
    }
    public void setTypeComposant(TypeComposant typeComposant) {
        this.typeComposant = typeComposant;
    }
    public Composant getComposant() {
        return composant;
    }
    public void setComposant(Composant composant) {
        this.composant = composant;
    }

}
