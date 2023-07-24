package FactoryPattern;

import FactoryPattern.Mario;

public  class SuperMario extends Mario {

    @Override
    void jump() {
        System.out.println("Super Mario Jump");
    }

    @Override
    void run() {
        System.out.println("Super Mario run");
    }
}