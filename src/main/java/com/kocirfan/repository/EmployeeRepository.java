package com.kocirfan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// JPA-Hibernate içinde CRUD işlemlerinin yapılacağı yer
// JpaRepository>CrudRepository
@Repository
public interface EmployeeRepository extends CrudRepository {

}
