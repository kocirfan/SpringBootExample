package com.kocirfan.business.services;

import com.kocirfan.business.dto.EmployeeDto;
import com.kocirfan.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

// burası bir servis yani bir hizmet veriyoruz ve bir interface olduğu ortada bakalım hizmet veren metotlarımız ne iş yapar
public interface EmployeeServices {

    //CRUD
    // birileri bu metodu ovverride edip bütün employeeleri listeleyecek
    public List<EmployeeDto> getAllEmployees();

    //CRUD
    // birileri bu metodu ovverride edip bir employee oluşturacak
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    //CRUD
    // birileri bu metodu ovverride edip employee objesine ait olan id ye göre bir sorgulama yapacak
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id) throws Throwable;

    //CRUD
    // birileri bu metodu ovverride edip employee objesine ait olan id ile ve/veya Objenin doğrudan kendisiyle bir güncelleme yapacak
    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto) throws Throwable;

    //CRUD
    // birileri bu metodu ovverride edip Map ile bir key value şeklinde sorgulama yaparak employee id si ile silme işlemi yapacak
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id) throws Throwable;


    //model Mapper
    public EmployeeDto EntityToDto(EmployeeEntity employeeEntity);
    public EmployeeEntity DtoToEntity(EmployeeDto employeeDto);
}
