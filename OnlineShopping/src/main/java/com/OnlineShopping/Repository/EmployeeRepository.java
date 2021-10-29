package com.OnlineShopping.Repository;
import com.OnlineShopping.Entities.Employee; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
