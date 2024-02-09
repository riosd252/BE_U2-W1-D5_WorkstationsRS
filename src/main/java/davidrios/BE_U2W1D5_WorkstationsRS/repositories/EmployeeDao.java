package davidrios.BE_U2W1D5_WorkstationsRS.repositories;

import davidrios.BE_U2W1D5_WorkstationsRS.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
}
