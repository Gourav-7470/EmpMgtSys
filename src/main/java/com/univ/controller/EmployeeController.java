
package com.univ.controller;

import com.univ.entity.Employee;
import com.univ.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dashboard")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String listEmployees(
            @RequestParam(value = "keyword", required = false) String keyword,
            Model model) {

        List<Employee> employees;
        if (keyword != null && !keyword.isEmpty()) {
            employees = employeeService.searchEmployees(keyword);
        } else {
            employees = employeeService.getAllEmployees();
        }

        model.addAttribute("employees", employees);
        model.addAttribute("keyword", keyword);
        return "dashboard"; 
    }

    @GetMapping("/new")
    public String createEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add_employee";
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/dashboard";
    }

    @GetMapping("/edit/{id}")
    public String editEmployeeForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "edit_employee";
    }

    @PostMapping("/edit/{id}")
    public String updateEmployee(@PathVariable("id") Long id, @ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/dashboard";
    }

    
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/dashboard";
    }
}

