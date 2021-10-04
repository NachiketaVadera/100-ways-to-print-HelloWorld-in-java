package com.helloworld;

import org.springframework.web.client.RestTemplate;

public class HelloWorld_UsingAPI {

  private static void greet() {
    final String uri = "http://localhost:8080/greetings";

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);

    System.out.println(result);
  }

  public static void main(String[] args) {
    try {
      greet();
    } catch (Exception ex) {
      System.out.println(
          "There was an exception while printing Hello World from an API call");
    }
  }
}