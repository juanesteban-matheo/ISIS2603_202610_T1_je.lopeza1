package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    // Atributos
    private Long id;
    private String titulo;
    private int anioLanzamiento;

    // Asociaciones
}
