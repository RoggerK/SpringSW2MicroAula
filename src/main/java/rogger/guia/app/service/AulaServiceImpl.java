package rogger.guia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.client.OpenFeignClient;
import rogger.guia.app.dto.AlumnoDTO;
import rogger.guia.app.model.AlumnoAulaFK;
import rogger.guia.app.model.Aula;
import rogger.guia.app.model.AulaDetalle;
import rogger.guia.app.repository.AulaRepository;
import rogger.guia.app.repository.DetalleAulaRepository;

@Service
public class AulaServiceImpl implements AulaService {
	@Autowired
	private AulaRepository aulaRepo;
	@Autowired
	private DetalleAulaRepository detalleRepo;
	 @Autowired
	 private OpenFeignClient client;
	 
	@Override
	public void guardarAula(Aula aula) {
		// TODO Auto-generated method stub
		aulaRepo.save(aula);
	}

	@Override
	public void asignarAlumnoAula() {
		// TODO Auto-generated method stub
		List<AlumnoDTO> listado = client.listarAlumnos();
		AlumnoAulaFK fk = null;
		AulaDetalle detalle = null;
		for (AlumnoDTO alumno : listado) {
			fk = new AlumnoAulaFK();
			fk.setIdAlumno(alumno.getCod());
			fk.setIdAula(1);
			
			detalle = new AulaDetalle();
			detalle.setFk(fk);
			detalleRepo.save(detalle);
		}
	}

}
