/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author lll
 */
@Component
public class Alien {
    @Autowired
    private computer comp;

    public computer getComp() {
        return comp;
    }

    public void setComp(computer comp) {
        this.comp = comp;
    }
    public void show() {
        System.out.println("Hello World");
        comp.features();//To change body of generated methods, choose Tools | Templates.
    }
    
}
