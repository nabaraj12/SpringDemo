/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author lll
 */

@Component
@Primary
public class desktop implements computer{

    @Override
    public void features() {
        System.out.println("Inside Desktop features");
    }
    
}
