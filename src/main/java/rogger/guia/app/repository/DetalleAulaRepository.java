package rogger.guia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rogger.guia.app.model.AulaDetalle;

public interface DetalleAulaRepository extends JpaRepository<AulaDetalle, Integer> {

}
