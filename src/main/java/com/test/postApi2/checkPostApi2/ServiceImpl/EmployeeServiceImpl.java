package com.test.postApi2.checkPostApi2.ServiceImpl;

import com.test.postApi2.checkPostApi2.Entity.Employee;
import com.test.postApi2.checkPostApi2.Repository.EmployeeRepository;
import com.test.postApi2.checkPostApi2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("employeeservice")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepositories;

    @Override
    public void CreateEmployee(Employee employee) {
        employee.getEid();
        empRepositories.save(employee);
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee>  empList=empRepositories.findByName(name);
        return empList;
    }

    @Override
    public boolean isEmployeeExist(Employee employee) {

        return findByName(employee.getName()) != null;
    }

}
