package io.lord.shadow.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

    @GetMapping("/ping")
    public ResponseEntity Ping() {

        return new ResponseEntity(HttpStatus.OK);
    }

}
