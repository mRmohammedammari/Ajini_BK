package ma.ajini.Ajinibk.dao;

import ma.ajini.Ajinibk.entities.Poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource @CrossOrigin("*")
public interface PosteReposotory extends JpaRepository<Poste,Long> {
}
