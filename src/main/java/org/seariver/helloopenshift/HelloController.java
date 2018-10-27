package org.seariver.helloopenshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${hello.message}")
    private String message;

    @GetMapping(value = "hello", produces = "application/json")
    public ResponseEntity hello() {

        String json = String.format("{\"hello\": \"%s\", \"appName\": \"%s\"}", message, appName);

        return ResponseEntity.ok().body(json);
    }
}
