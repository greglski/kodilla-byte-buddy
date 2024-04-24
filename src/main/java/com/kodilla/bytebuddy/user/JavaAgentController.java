package com.kodilla.bytebuddy.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/user")
public class JavaAgentController {

    @GetMapping("/text")
    public ResponseEntity<String> getUserText() {
        var user = new User();
        var result = user.doSomething();
        return ResponseEntity.ok(result);
    }
}
