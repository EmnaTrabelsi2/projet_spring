package tn.esprit.spring.studycasebi.services;

import tn.esprit.spring.studycasebi.entities.Client;
import tn.esprit.spring.studycasebi.repositories.ClientRepository;

import java.util.List;

public class Clientservice implements  IClientservice{
    ClientRepository clientRepository;
    @Override
    public Client ajouterClient(Client c) {
return clientRepository.save(c);    }

    @Override
    public Client modifierClient(Client c) {
return clientRepository.save(c);    }

    @Override
    public void supprimerClient(Long idclient) {
        clientRepository.deleteById(idclient);
    }

    @Override
    public Client afficherClient(Long idclient) {
        return clientRepository.findById(idclient).get();
        //return clientRepository.findBYId(id.OrFalse(null)
    }

    @Override
    public List<Client> listClient() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public void ajouterClients(List<Client> clients) {
        clientRepository.saveAll(clients);
    }
}
