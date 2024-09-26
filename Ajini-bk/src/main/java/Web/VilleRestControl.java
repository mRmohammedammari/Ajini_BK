package Web;

import ma.ajini.Ajinibk.dao.VilleRepostory;
import ma.ajini.Ajinibk.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Villes")
public class VilleRestControl {
    // Injection du repository pour accéder à la base de données
    @Autowired
    private VilleRepostory Villeesp;

    // Méthode GET pour récupérer tous les Categories
    @GetMapping
    public List<Ville> getRegions() {
        return Villeesp.findAll(); // Récupère tous les Categories depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Ville getRegionsById(@PathVariable Long id) {
        return Villeesp.findById(id).orElse(null); // Cherche le client dans la base de données
    }

    // Méthode POST pour ajouter un nouveau client
    @PostMapping
    public Ville addRegions(@RequestBody Ville ville) {
        return Villeesp.save(ville); // Sauvegarde le categorie dans la base de données et retourne le client ajouté
    }

}




