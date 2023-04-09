package com.test.postApi2.checkPostApi2.Repository;

import com.test.postApi2.checkPostApi2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    Employee findById(int eid);
}