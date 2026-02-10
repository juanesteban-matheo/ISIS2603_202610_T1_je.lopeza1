package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    // Atributos
    private Long id;
    private String titulo;
    private int anioLanzamiento;

    // Asociaciones
    @PodamExclude
    @ManyToOne
    private DirectorEntity director;

    @ManyToMany(mappedBy = "actores")
    private ArrayList<ActorEntity> actores = new ArrayList<ActorEntity>();
}
