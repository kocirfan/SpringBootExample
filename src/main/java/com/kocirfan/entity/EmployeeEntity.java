package com.kocirfan.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@Log4j2

@Entity
@Table(name = "employees")
public class EmployeeEntity extends BaseEntity implements Serializable {


    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_name")
    private String emailId;

    public EmployeeEntity(String firsName, String lastName, String emailId) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
}
