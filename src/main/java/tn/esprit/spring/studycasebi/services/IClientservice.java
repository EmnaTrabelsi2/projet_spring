package tn.esprit.spring.studycasebi.services;

import tn.esprit.spring.studycasebi.entities.Client;

import java.util.List;

public interface IClientservice {
    Client ajouterClient(Client c);
    Client modifierClient(Client c);
    void supprimerClient(Long idclient);
    Client afficherClient(Long idclient);
    List<Client> listClient();
    void ajouterClients(List<Client> clients);

}
