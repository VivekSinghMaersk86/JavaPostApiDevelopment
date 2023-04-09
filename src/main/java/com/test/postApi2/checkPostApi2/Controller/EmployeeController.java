package com.test.postApi2.checkPostApi2.Controller;

import com.test.postApi2.checkPostApi2.Entity.Employee;
import com.test.postApi2.checkPostApi2.Service.EmployeeService;
import com.test.postApi2.checkPostApi2.Util.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    @RequestMapping(value = "/Y", method = RequestMethod.GET)
    public String getName(){
        return "OrgVivek";
    }

    @RequestMapping(value = "/Employee", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json" )
    public void createEmployee(@RequestParam(value = "eid", defaultValue = "104") int eid ,
                               @RequestParam(value = "name", required = false, defaultValue = "vinodOrg")String name ,
                               @RequestParam(value = "salary", required = false, defaultValue = "18999")String salary ,
                               @RequestParam(value = "Desination", required = false, defaultValue = "TechLead")String Desination ,
                               @RequestParam(value = "Empemail", required = false, defaultValue = "vivek.aspl@yahoo.com")String Empemail ,
                               @RequestParam(value = "Address", required = false, defaultValue = "Pune")String Address ) throws Exception {

        Employee Employee =new Employee();

        Employee.setEid(eid);
        Employee.setName(name);
        Employee.setSalary(salary);
        Employee.setDesignation(Desination);
        Employee.setEmpEmail(Empemail);
        Employee.setAddress(Address);

        if (EmployeeService.isEmployeeExist(Employee)) {
            new CustomErrorType("Unable to create. A Employee with name " +
                    Employee.getName() + " already exist.");

        }
        EmployeeService.CreateEmployee(Employee);
    }

    @RequestMapping(value = "/check/{name}", method = RequestMethod.GET)
    public  List<Employee> findByName(@PathVariable("name") String name) throws Exception {
        List<Employee>  ResponseEmpList = EmployeeService.findByName(name);
        return ResponseEmpList;
    }
}
