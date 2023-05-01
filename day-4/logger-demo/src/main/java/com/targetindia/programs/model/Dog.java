package com.targetindia.programs.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal {

    @Override
    public void talk (){
        log.trace("Dog is barking...");
    }
}
