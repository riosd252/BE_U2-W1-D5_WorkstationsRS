package davidrios.BE_U2W1D5_WorkstationsRS.repositories;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.CorporateCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateCenterDao extends JpaRepository<CorporateCenter, Long> {
}
