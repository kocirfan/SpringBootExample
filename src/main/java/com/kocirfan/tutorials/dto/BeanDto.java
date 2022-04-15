package com.kocirfan.tutorials.dto;

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
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod(){
        log.info("Bean Başlamadan önce ben varım");
        System.out.println("bean başlamadan önce ben varım");
    }

    //bitiş
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra ben varım");
        System.err.println("bean bittikten sonra ben varım");
    }

}
