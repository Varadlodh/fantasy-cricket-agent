package org.varadlodh.fatasycricketagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "✅ Fantasy Cricket Agent is running!";
    }
}
