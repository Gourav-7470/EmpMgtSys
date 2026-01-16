package com.univ.service;

import com.univ.entity.Employee;
import com.univ.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public List<Employee> searchEmployees(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return getAllEmployees();
        }
        return repository.findByNameContainingIgnoreCaseOrCityNameContainingIgnoreCase(keyword, keyword);
    }
}
