package ma.enset.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medcin {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medcin", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Collection<RendezVous> rendezVous;

}
