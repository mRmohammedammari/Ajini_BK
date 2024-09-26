package ma.ajini.Ajinibk;

import ma.ajini.Ajinibk.dao.ProfessionnelRepository;
import ma.ajini.Ajinibk.entities.Professionnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public abstract class AjiniBkApplication implements CommandLineRunner {
	@Autowired
	private ProfessionnelRepository professionnelRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(AjiniBkApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception{
		Random rnd =new Random();
		Professionnel  p ;
		repositoryRestConfiguration.exposeIdsFor(Professionnel.class);

		/*int i ;
		for (i=0;i<5;i++) {
            p = new Professionnel();
			p.setAdresse(RandomString.make(15));
			p.setEmailPrf(RandomString.make(9));
			p.setDescription(RandomString.make(29));
			p.setNomPrf(RandomString.make(9));
			p.setIdmetier(rnd.nextInt());
			p.setIdcompte(rnd.nextInt());
			p.setPrenomPrf(RandomString.make(9));
			p.setPhotoPrf("avatar.jpg");
			p.setSexe(rnd.nextBoolean());
			p.setSunomPrf(RandomString.make(9));
			p.setTelephone1(RandomString.make(10));
			p.setTelephone2(RandomString.make(9));
			p.setIdville(rnd.nextInt(9));
			p.setIdmetier(rnd.nextInt(9));
			professionnelRepository.save(p);

		}
		for (i=0;i<5;i++) {
			professionnelRepository.save(new Professionnel( rnd.nextInt(), "mohamed", "ammari", "adresse casa", "email", "psudo", "descrp", "tel1", "tel2", rnd.nextBoolean(), rnd.nextInt(), rnd.nextInt(), "oujda", "photo"));

		}*/
	}
}
