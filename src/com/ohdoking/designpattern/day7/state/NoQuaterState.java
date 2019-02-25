package com.ohdoking.designpattern.day7.state;

public class NoQuaterState implements State {
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you putted the coin");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please input the coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please input the coin");
    }

    @Override
    public void dispense() {
        System.out.println("Please input the coin");
    }
}
