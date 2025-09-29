package tn.esprit.spring.studycasebi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrément
    private Long idMenu;

    private String libelleMenu;
@Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private float prixTotal;
    @OneToMany(mappedBy = "menus")
    List<Commande> commandeList;

@ManyToMany(mappedBy = "menuList")
List<ChefCuisinier>chefCuisinierList;
@OneToMany(mappedBy = "menu")
List<Composant> composantList;
    // --- Constructeurs ---
    public Menu() {}

    public Menu(String libelleMenu, TypeMenu typeMenu, float prixTotal) {
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prixTotal = prixTotal;
    }

    // --- Getters & Setters ---
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }
}
