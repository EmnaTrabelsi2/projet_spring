package tn.esprit.spring.studycasebi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Commande {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrément
    private Long idcommande;
   private LocalDate datecommande;
   private Integer pourcentageRemise;
   private Float totalRemise;
   private Float totalcommande;
   private Long note;
   public Commande() {  }
    public Commande(Long idcommande,LocalDate datecommande,Integer pourcentageRemise,Float totalRemise,Float totalcommande,Long note) {
       this.idcommande = idcommande;
       this.datecommande = datecommande;
       this.pourcentageRemise = pourcentageRemise;
       this.totalRemise = totalRemise;
       this.totalcommande = totalcommande;
       this.note = note;
    }
    public Long getIdcommande() { return idcommande; }
    public LocalDate getDatecommande() { return datecommande; }
    public Integer getPourcentageRemise() { return pourcentageRemise; }
     public Float getTotalRemise() { return totalRemise; }
    public Float getTotalcommande() { return totalcommande; }
    public Long getNote() { return note; }
    public void setIdcommande(Long idcommande) {
       this.idcommande = idcommande;
    }
    public void setDatecommande(LocalDate datecommande) {
       this.datecommande = datecommande;
    }
    public void setPourcentageRemise(Integer pourcentageRemise) {
       this.pourcentageRemise = pourcentageRemise;
    }
    public void setTotalRemise(Float totalRemise) {
       this.totalRemise = totalRemise;
    }
    public void setTotalcommande(Float totalcommande) {
       this.totalcommande = totalcommande;

    }
    public void setNote(Long note) {
       this.note = note;
    }
}
