package org.varadlodh.fatasycricketagent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Fantasy Cricket API is live and working perfectly!";
    }
}
