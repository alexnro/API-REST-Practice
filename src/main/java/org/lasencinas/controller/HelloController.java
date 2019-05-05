package org.lasencinas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path="/hello")
    public String SayHi() {
        return "Hi!";
    }
}
