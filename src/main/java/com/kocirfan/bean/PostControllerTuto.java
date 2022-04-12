package com.kocirfan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostControllerTuto {

//    @Autowired
//    Logger LOG;
//
//    // parametresiz constructor kulanımında
//    // bean oluşmayacağı için null alıyoruz ve bağımlılığı enjekte edemiyoruz
////    public PostControllerTuto() {
////        LOG.info("log info çağırıldı");
////    }
//
//    // burada ise bean nesnesi oluştuğunda bu metot hemen oluşacak anatasyon ile
//    @PostConstruct
//    public void init(){
//        LOG.info("Log info çağırıldı");
//    }
//
//    public static void main(String[] args) {
//        PostControllerTuto beanController= new PostControllerTuto();
//        System.out.println(beanController);
//    }
}
