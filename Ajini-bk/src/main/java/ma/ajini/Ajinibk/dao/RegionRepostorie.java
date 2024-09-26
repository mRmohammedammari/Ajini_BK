package ma.ajini.Ajinibk.dao;

import ma.ajini.Ajinibk.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface RegionRepostorie extends JpaRepository<Region,Long> {
}
