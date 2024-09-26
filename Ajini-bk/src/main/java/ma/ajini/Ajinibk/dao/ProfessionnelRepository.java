package ma.ajini.Ajinibk.dao;

import ma.ajini.Ajinibk.entities.Professionnel;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProfessionnelRepository extends JpaRepository<Professionnel, Long> {
    @RestResource(path = "/listnom")
   // @Query("SELECT p FROM Professionnel p WHERE p.nom like %:mc%")
    public  List<Professionnel> findBynomPrfContains(@Param("mc") String mc);

    @RestResource(path = "/listeville")
    // @Query("SELECT p FROM Professionnel p WHERE p.nom like %:mc%")
    public  List<Professionnel> findByidville(@Param("mc") int mc);



}
