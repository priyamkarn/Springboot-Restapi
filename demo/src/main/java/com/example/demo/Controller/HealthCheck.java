package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("journal")
public class HealthCheck {
    @GetMapping("health")
    //    @GetMapping("health/{id}")
    //public void fun(@PathVariable int id)
    public String healthCheck() {
        return "health";
    }
    @PostMapping("priyam")
    public String print(@RequestBody String message)
    {
        System.out.println(message);
        return "Message received: " + message;
    }
    @GetMapping("/health/{id}")
    public String getbyid(@PathVariable int id)
    {
        return "priyam"+id;
    }
}