package dev.madhavi.myspringfirstapplication;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/say")
public class MyFirstApi {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){

        return "Hello" + name;
    }
    @GetMapping("/bye")
    public String sayBye(){

        return "Bye";
    }
}
