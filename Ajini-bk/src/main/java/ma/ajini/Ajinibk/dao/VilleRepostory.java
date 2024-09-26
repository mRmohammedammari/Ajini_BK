package ma.ajini.Ajinibk.dao;

import ma.ajini.Ajinibk.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface VilleRepostory extends JpaRepository<Ville,Long> {
}
