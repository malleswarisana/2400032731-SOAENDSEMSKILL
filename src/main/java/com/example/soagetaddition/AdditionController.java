
package com.example.soagetaddition;

import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping(
        value = "/ms1/add",
        produces = "text/plain;charset=UTF-8"
    )
    public ResponseEntity<String> add(
            @RequestParam int a,
            @RequestParam int b) {

        int sum = a + b;

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(
                    "text/plain;charset=UTF-8"))
                .body("MS addition = " + sum);
    }
}
