package com.brynachj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brynach.jones on 27/04/2017.
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
