/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * sivakumar
 */

package learning.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("*.htm")
public class TestAnnotationController {

    @RequestMapping(value="MultiActionMethodNameResolver.htm",method= RequestMethod.GET)
    public void processTest(){

        System.out.println("In to the processing of processTest");

    }


}
