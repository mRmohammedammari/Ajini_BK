package Web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.ajini.Ajinibk.dao.ProfessionnelRepository;
import ma.ajini.Ajinibk.entities.Professionnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class ProfessionnelRestControl {
    private ProfessionnelRepository professionnelRepository;

  /*  @GetMapping(path = "/ajini/professionnel/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getphoto(@PathVariable("id") long id) throws Exception{
        Professionnel p=professionnelRepository.findById(id).get();
         return   Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/Ajini/Professionnel"+p.getPhotoPrf()));
    }*/

    // Injection du repository pour accéder à la base de données
    @Autowired
    private ProfessionnelRepository profRepos;

    // Méthode GET pour récupérer tous les clients
    @GetMapping
    public List<Professionnel> getProfessionnel() {
        return profRepos.findAll(); // Récupère tous les Professionnel depuis la base de données
    }

    // Méthode GET pour récupérer un client par son ID
    @GetMapping("/{id}")
    public Professionnel getProfessionnelById(@PathVariable Long id) {
        return profRepos.findById(id).orElse(null); // Cherche le Professionnel dans la base de données
    }

    // Méthode POST pour ajouter un nouveau Professionnel
    @PostMapping
    public Professionnel addProfessionnel(@RequestBody Professionnel profes) {
        return profRepos.save(profes); // Sauvegarde le professionnel dans la base de données et retourne le professionnel ajouté
    }


}
