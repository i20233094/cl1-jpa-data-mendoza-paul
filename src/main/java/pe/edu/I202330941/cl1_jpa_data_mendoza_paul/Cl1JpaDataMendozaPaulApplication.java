package pe.edu.I202330941.cl1_jpa_data_mendoza_paul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.I202330941.cl1_jpa_data_mendoza_paul.entity.CountryLanguage;
import pe.edu.I202330941.cl1_jpa_data_mendoza_paul.repository.CountryRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Cl1JpaDataMendozaPaulApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataMendozaPaulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<String> countryCodesToDelete = Arrays.asList("COL", "ARG");
//		countryRepository.deleteAllById(countryCodesToDelete);
//		System.out.println("Países eliminados: " + countryCodesToDelete);

		List<CountryLanguage> languagesArg = countryRepository.findByCountryCode("ARG");

		if (!languagesArg.isEmpty()) {
			System.out.println("Lenguajes hablados en Argentina:");
			languagesArg.forEach(language -> System.out.println(language.getLanguage()));
		} else {
			List<CountryLanguage> languagesPer = countryRepository.findByCountryCode("PER");
			System.out.println("Lenguajes hablados en Perú:");
			languagesPer.forEach(language -> System.out.println(language.getLanguage()));
		}

	}
}