package com.kocirfan;

import com.kocirfan.data.entity.EmployeeEntity;
import com.kocirfan.data.repository.EmployeeRepository;
import com.kocirfan.test.TestCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringBootExampleApplicationTests  implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;


    @Test
    @Override
    public void testCreate() {

        EmployeeEntity employeeEntity=EmployeeEntity
                .builder()
                .firstName("irfan test")
                .lastName("kocak test")
                .emailId("irfantest@gmail.com")
                .build();
        employeeRepository.save(employeeEntity);
        assertNotNull(employeeRepository.findById(1L).get());
    }

    @Test
    @Override
    public void testFindById() {

        EmployeeEntity employeeEntity=employeeRepository.findById(1L).get();

        assertEquals("irfan test", employeeEntity.getFirstName());

    }




    @Test
    @Override
    public void testList() {

        List<EmployeeEntity> list=employeeRepository.findAll();

        //eğer sıfırdan büyükse liste vardır
        assertThat(list).size().isGreaterThan(0);
    }

    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity=employeeRepository.findById(1L).get();

        employeeEntity.setFirstName("irfan 66 test");
        employeeRepository.save(employeeEntity);

        // eşit değilse sorun olmayacak eşitse exception
        assertNotEquals("irfan test", employeeRepository.findById(1L).get().getFirstName());

    }


    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);

        assertThat(employeeRepository.existsById(1L)).isFalse();

    }
}
