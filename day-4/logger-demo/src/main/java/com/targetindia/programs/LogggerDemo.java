package com.targetindia.programs;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogggerDemo {

    public static void main(String[] args) {

        log.trace("This is trace message");
        log.debug("This is debug message");
        log.info("This is info message");
        log.warn("This is warn message");
        log.error("This is error message");

    }

}
