package rogger.guia.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "detalle_aula")
public class AulaDetalle { //tabla identificada con los pk
	@Id
	private AlumnoAulaFK fk = new AlumnoAulaFK();
	//private Integer precio;
	//private Date fecha;
}
