package geekster.shiv.Sb_EmployeeMana.controller;


import geekster.shiv.Sb_EmployeeMana.Service.HrService;
import geekster.shiv.Sb_EmployeeMana.dao.HrEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hr")
public class HrController {
    @Autowired
    HrService hrService;

    @PutMapping("update_Employee_details/{id}")
    public ResponseEntity<String> updateEmployeeDetails(@RequestBody HrEmployee employee, @PathVariable int id){
        return hrService.updateDetails(employee,id);
    }

}
