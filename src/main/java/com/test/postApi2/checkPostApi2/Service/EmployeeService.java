package com.test.postApi2.checkPostApi2.Service;

import com.test.postApi2.checkPostApi2.Entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {

    void CreateEmployee(Employee Employee);

    List<Employee> findByName(String name);

    boolean isEmployeeExist(Employee employee);
}
