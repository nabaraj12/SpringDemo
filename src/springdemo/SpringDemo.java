/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lll
 */
public class SpringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
//        laptop l1=context.getBean(laptop.class);
        Alien A1=context.getBean(Alien.class);
//        A1.setComp(l1);
        A1.show();
    }
    
}
