package com.ictec.dpatterns;

public class ComMonitor extends ComputerDecorator{
    Computer comMonitor;
    public ComMonitor(Computer com) {
        comMonitor = com;
    }

    @Override
    public String description() {
        return comMonitor.description() + " and a Monitor";
    }
}
