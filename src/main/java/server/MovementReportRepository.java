package server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementReportRepository extends CrudRepository<MovementReport, String> {
}
