package com.ohdoking.designpattern.day7.state;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("wait a seconds, A gumball is coming out the slot");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you already get a stuff.");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn handle only one time.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
