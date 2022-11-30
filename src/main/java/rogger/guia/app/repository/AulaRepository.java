package rogger.guia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
