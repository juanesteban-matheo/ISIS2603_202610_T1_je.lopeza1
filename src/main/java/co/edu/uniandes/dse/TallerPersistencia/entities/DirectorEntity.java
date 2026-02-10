package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.ArrayList;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    // Atributos
    private Long id;
    private String nombre, biografia;

    // Asociaciones
    @PodamExclude
    @OneToMany(mappedBy = "director")
    private ArrayList<PeliculaEntity> peliculas = new ArrayList<PeliculaEntity>();
}