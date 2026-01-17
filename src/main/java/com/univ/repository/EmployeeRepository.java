package com.univ.repository;
import java.util.List;
import com.univ.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	 // Search by name or city
    List<Employee> findByNameContainingIgnoreCaseOrCityNameContainingIgnoreCase(String name, String cityName);

}
