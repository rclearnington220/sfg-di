package com.rc.demo.controllers;

import com.rc.demo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller=new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingService();

    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}