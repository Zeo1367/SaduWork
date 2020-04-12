package com.project.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/*
* This is a controller class
* A controller is a component of spring that accepts requests.
*  Any request go to the controller that has a url bind to it as that of the request
*  like if anyone hit request for /print with GET at this project then that request will come to this controller.
* */

/*
* It is marked with rest controller and by this way it follows rest properties
* There are two types of controller : Rest and normal
* A rest controller returns Object which can be String, int, Collections or custom object like car
* */
@RestController
public class TestController {

    /*
    * This is the request Mapping which is done on to methods of controllers to accept request
    * of url having same endpoints as mentioned in it. It tells Spring that I have mapping of /print
    * with GET mapping you should send request with those endpoints to me
    *
    * Another way of writing it is
    * @RequestMapping(value = "/print",method = RequestMethod.GET)
    * here we mention type of HTTP call.
    * The RequestMapping is more of generic as should be used if your method can change its HTTP property
    * else like below we can directly use the staticMapping
    * */

    @GetMapping("/print")
    private String  printingMethod(){
        return "Hii";
    }

}

