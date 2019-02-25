package com.ohdoking.designpattern.day7.state;

public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please input only one coin");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("A coin is returned.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned handle");
        gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispense() {
        System.out.println("A gumball can't eject out");
    }
}
