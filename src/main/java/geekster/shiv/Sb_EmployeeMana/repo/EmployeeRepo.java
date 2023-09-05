package geekster.shiv.Sb_EmployeeMana.repo;

import geekster.shiv.Sb_EmployeeMana.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
