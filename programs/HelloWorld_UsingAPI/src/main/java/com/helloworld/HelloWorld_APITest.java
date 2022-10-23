package com.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloWorld_APITest {

    @InjectMocks
    private HelloWorld_API helloWorld_API;

    @Test
    @DisplayName("String return Hello World! when successful")
    void string_ReturnsHelloWorld_whenSuccessful(){
        String expectedValue = "Hello World!";

        String helloWorld = helloWorld_API.greetings();

        Assertions.assertEquals(expectedValue, helloWorld);
    }

}