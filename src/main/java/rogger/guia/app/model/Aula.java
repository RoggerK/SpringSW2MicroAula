package rogger.guia.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aula")
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAula;
	private String aula;
}
