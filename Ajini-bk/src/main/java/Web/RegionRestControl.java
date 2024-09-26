package Web;

import ma.ajini.Ajinibk.dao.RegionRepostorie;
import ma.ajini.Ajinibk.entities.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Regions")
public class RegionRestControl {
    // Injection du repository pour accéder à la base de données
    @Autowired
    private RegionRepostorie Regresp;

    // Méthode GET pour récupérer tous les Categories
    @GetMapping
    public List<Region> getRegions() {
        return Regresp.findAll(); // Récupère tous les Categories depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Region getRegionsById(@PathVariable Long id) {
        return Regresp.findById(id).orElse(null); // Cherche le client dans la base de données
    }

    // Méthode POST pour ajouter un nouveau client
    @PostMapping
    public Region addRegions(@RequestBody Region region) {
        return Regresp.save(region); // Sauvegarde le categorie dans la base de données et retourne le client ajouté
    }

}




