package tn.esprit.spring.studycasebi.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity               // Indique que c'est une entité JPA

public class Client {
    @Id // clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idclient ;
    private String indentifiant ;
private Date datePremiereVisite;
@OneToMany(mappedBy = "client")
    List<Commande>commandes ;

public Client(){}
public Client(String indentifiant, Date datePremiereVisite) {this.indentifiant=indentifiant;this.datePremiereVisite=datePremiereVisite;
}

public Long getIdclient() {return idclient;}
    public String getIndentifiant() {return indentifiant;}
        public Date getDatePremiereVisite() {return datePremiereVisite;}
    public void setIdclient(Long idclient) {this.idclient=idclient;}
    public void setIndentifiant(String indentifiant) {this.indentifiant=indentifiant;}
    public void setDatePremiereVisite(Date datePremiereVisite) {this.datePremiereVisite=datePremiereVisite;}


}
