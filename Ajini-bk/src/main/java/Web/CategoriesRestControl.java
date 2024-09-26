package Web;

import ma.ajini.Ajinibk.dao.CategoriesRepostory;
import ma.ajini.Ajinibk.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categories")
public class CategoriesRestControl {
    // Injection du repository pour accéder à la base de données
    @Autowired
    private CategoriesRepostory catgresp;

    // Méthode GET pour récupérer tous les Categories
    @GetMapping
    public List<Categories> getCategories() {
        return catgresp.findAll(); // Récupère tous les Categories depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Categories getCategoriesById(@PathVariable Long id) {
        return catgresp.findById(id).orElse(null); // Cherche le client dans la base de données
    }

    // Méthode POST pour ajouter un nouveau client
    @PostMapping
    public Categories addCategories(@RequestBody Categories categories) {
        return catgresp.save(categories); // Sauvegarde le categorie dans la base de données et retourne le client ajouté
    }

}
