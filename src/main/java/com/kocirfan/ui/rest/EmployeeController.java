package com.kocirfan.ui.rest;
// dışarıya açılan yapı

import com.kocirfan.business.dto.EmployeeDto;
import com.kocirfan.business.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

    //ROOT
    //http://localhost:8080/api/v1/index
    @GetMapping({"/index", "/"})
    public String getRoot(){

        return "index";
    }




    //LIST
    //http://localhost:8080/api/v1/employess
    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees(){
        List<EmployeeDto> employeeDtoList=employeeServices.getAllEmployees();
        return employeeDtoList;
    }





    //FIND
    //http://localhost:8080/api/v1/employess/1
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) throws Throwable {
        ResponseEntity<EmployeeDto> employeeDto= employeeServices.getEmployeeById(id);
        return employeeDto;
    }


    //SAVE
    //http://localhost:8080/api/v1/employees
    @PostMapping("/employees")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
        employeeServices.createEmployee(employeeDto);
        return employeeDto;
    }

    //UPDATE
    //http://localhost:8080/api/v1/employees/1
    @PutMapping ("/employees/{id}")
    public ResponseEntity<EmployeeDto>  updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) throws Throwable {
        employeeServices.updateEmployee(id, employeeDto);
        return ResponseEntity.ok(employeeDto);
    }

    //DELETE
    //http://localhost:8080/api/v1/employees/1
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) throws Throwable {
        employeeServices.deleteEmployee(id);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);

    }






}
