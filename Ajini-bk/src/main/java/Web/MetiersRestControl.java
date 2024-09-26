package Web;

import ma.ajini.Ajinibk.dao.MetiersRepostory;
import ma.ajini.Ajinibk.entities.Metiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Metiers")
public class MetiersRestControl {
    @Autowired
    private MetiersRepostory Metiresp;

    // Méthode GET pour récupérer tous les Metire
    @GetMapping
    public List<Metiers> getMetiers() {
        return Metiresp.findAll(); // Récupère tous les Metiers depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Metiers getMetiersById(@PathVariable Long id) {
        return Metiresp.findById(id).orElse(null); // Cherche le Metiers dans la base de données
    }

    // Méthode POST pour ajouter un nouveau Metier
    @PostMapping
    public Metiers addMetiers(@RequestBody Metiers metier) {
        return Metiresp.save(metier); // Sauvegarde le Metiers dans la base de données et retourne le client ajouté
    }
}
