package pe.edu.I202330941.cl1_jpa_data_mendoza_paul.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
@Data
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;



    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) obj;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language);
    }
}