package com.helloworld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorld_API {

  @RequestMapping("/greetings")
  String greetings() {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(HelloWorld_API.class, args);
  }

}
