package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.ArrayList;

@Data
@Entity
public class ActorEntity extends BaseEntity {
    // Atributos
    private Long id;
    private String nombre, nacionalidad;

    // Relaciones
    @PodamExclude
    @ManyToMany(mappedBy = "peliculas")
    private ArrayList<PeliculaEntity> peliculas = new ArrayList<PeliculaEntity>();
}
