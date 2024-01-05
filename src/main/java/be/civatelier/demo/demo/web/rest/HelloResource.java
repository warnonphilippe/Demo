package be.civatelier.demo.demo.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/biz")
public class HelloResource {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        String res = "Hello";
        return ResponseEntity.ok(res);
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable(value = "name") String name) {
        String res = "Hello " + name;
        return ResponseEntity.ok(res);
    }
    
}
