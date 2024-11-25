package pe.edu.I202330941.cl1_jpa_data_mendoza_paul.repository;
import org.springframework.data.repository.CrudRepository;
import pe.edu.I202330941.cl1_jpa_data_mendoza_paul.entity.Country;
import pe.edu.I202330941.cl1_jpa_data_mendoza_paul.entity.CountryLanguage;

import java.util.List;

////Eliminar
//public interface CountryRepository extends CrudRepository<Country, String> {
//}

//Buscar
public interface CountryRepository extends CrudRepository<CountryLanguage, String> {
    List<CountryLanguage> findByCountryCode(String countryCode);
}
