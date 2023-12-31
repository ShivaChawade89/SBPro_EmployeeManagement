package geekster.shiv.Sb_EmployeeMana.Service;


import geekster.shiv.Sb_EmployeeMana.dao.HrEmployee;
import geekster.shiv.Sb_EmployeeMana.model.Employee;
import geekster.shiv.Sb_EmployeeMana.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HrService {
    @Autowired
    EmployeeRepo employeeRepo;
    public ResponseEntity<String> updateDetails(HrEmployee employee, int id) {
        if(!employeeRepo.findById(id).isPresent()){
            return new ResponseEntity<>("record not found", HttpStatus.NOT_FOUND);
        }

        Employee employee1 =employeeRepo.findById(id).get();

        if(employee.getJobRole()!=null)
            employee1.setJobRole(employee.getJobRole());

        if(employee.getSalary()!=null)
            employee1.setSalary(employee.getSalary());


        employeeRepo.save(employee1);

        return new ResponseEntity<>("successfully updates", HttpStatus.OK);
    }
}
