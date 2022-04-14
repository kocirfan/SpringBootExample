package com.kocirfan.data.repository;

import com.kocirfan.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// JPA-Hibernate içinde CRUD işlemlerinin yapılacağı yer
// JpaRepository>CrudRepository
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
