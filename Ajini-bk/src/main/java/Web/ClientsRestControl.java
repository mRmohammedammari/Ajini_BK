/*package Web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class ClientsRestControl {
    private ClientsRestControl clientsRestControl;

    @GetMapping(path = "/ajini/Client")
    public postclient(){

    }

}
*/
package Web;

import ma.ajini.Ajinibk.dao.ClientReposotory;
import ma.ajini.Ajinibk.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsRestControl {

    // Injection du repository pour accéder à la base de données
    @Autowired
    private ClientReposotory cltresp;

    // Méthode GET pour récupérer tous les clients
    @GetMapping
    public List<Client> getClients() {
        return cltresp.findAll(); // Récupère tous les clients depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return cltresp.findById(id).orElse(null); // Cherche le client dans la base de données
    }

    // Méthode POST pour ajouter un nouveau client
    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return cltresp.save(client); // Sauvegarde le client dans la base de données et retourne le client ajouté
    }
}
