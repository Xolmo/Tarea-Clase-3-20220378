package com.example.clase4gtics.controller;


import com.example.clase4gtics.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {this.employeeRepository = employeeRepository;}

    @GetMapping(value = {"","/"})
    public String listaEmpleados(Model model) {
        model.addAttribute("listaEmpleados", employeeRepository.findAll());
        return "employee/list";
    }
}
