package com.targetindia.programs;

import com.targetindia.programs.model.Animal;
import com.targetindia.programs.model.Cat;
import com.targetindia.programs.model.Dog;
import com.targetindia.programs.model.Lion;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractDemo {

    public static void main(String[] args) {

        Animal a1;

        Cat c1 = new Cat();
        c1.talk();

        Dog d1 = new Dog();
        d1.talk();

        Lion l1 = new Lion();
        l1.talk();

        process(c1);
        process(d1);
        process(l1);

    }

    static void process (Animal a){

        log.trace("inside the process() , animal reference refers to an object of " + a.getClass().getName());
        a.talk();
    }

}
