package com.kocirfan.business.dto;
//DTO: Data Transfer Object ==> Middleware kısmında kullanılacak

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
