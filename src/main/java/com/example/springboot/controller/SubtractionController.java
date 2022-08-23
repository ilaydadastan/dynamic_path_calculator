package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SubtractionController {

    private String operation;

    @GetMapping(value = "{operation}" )
    public Object calculate(@PathVariable String operation, @RequestParam("n1") String s1, @RequestParam("n2") String s2){
        try {
            int n1=  Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println(n1);
            System.out.println(n2);


            if (operation.equals("sum")) {
                return n1+n2;
            }
            else if (operation.equals("subtraction")) {
                return n1-n2;

            }
            else if (operation.equals("divide")) {
                if (n2 == 0) {
                    return "not a number";

                }
                return n1/n2;


            }
            else if (operation.equals("multiple")) {
                return n1*n2;

            }
            return "unknown operation";

        }

        catch (NumberFormatException e){
            return "Please enter integer value ";

        }





    }

}
