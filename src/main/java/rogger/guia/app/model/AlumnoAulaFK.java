package rogger.guia.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class AlumnoAulaFK implements Serializable { //realiza el fk de las dos tablas en una - Serializable -> da una id unica para identificacion de error y más 
	private static final long serialVersionUID = -5857953398117561303L;
	
	//1ro pk
	@Column(name = "id_aula", nullable = false)
	private Integer idAula;
	//1do pk
	@Column(name = "id_alumno", nullable = false)
	private Integer idAlumno;
}
