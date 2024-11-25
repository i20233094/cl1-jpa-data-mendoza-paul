package pe.edu.I202330941.cl1_jpa_data_mendoza_paul.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode", insertable = false, updatable = false)
    private String countryCode;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private int population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    private Country country;
}