package rogger.guia.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "detalle_aula") //tabla intermedia donde se construye
public class AulaDetalle { //tabla identificada con los 2 pk
	@Id
	private AlumnoAulaFK fk = new AlumnoAulaFK();
	//private Integer precio;
	//private Date fecha;
}
