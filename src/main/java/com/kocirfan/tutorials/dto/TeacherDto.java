package com.kocirfan.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {
    private Long teacherId;

    @NotEmpty(message = "ad soyad alanı boş bırakılamaz")
    @Size(min = 1, max = 100)
    private String teacherNameSurname;

    @NotEmpty(message = "email alanı boş bırakılamaz")
    @Email(message = "uygun formatta mail girilmelidir")
    private String teacherEmail;

    @NotEmpty(message = "şifre alanı boş bırakılamaz")
//    @Min(value = 5, message = "minimum 5 karakter")
//    @Max(value = 20, message = "maksimum 20 karakter")
    @Size(min = 5, max = 15)
    private String teacherPassword;

}
