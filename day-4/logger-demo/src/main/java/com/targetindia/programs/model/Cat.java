package com.targetindia.programs.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Animal{

    @Override
    public void talk (){
        log.trace("Cat is meowing....");
    }
}
