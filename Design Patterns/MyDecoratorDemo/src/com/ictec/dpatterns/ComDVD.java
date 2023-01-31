package com.ictec.dpatterns;

public class ComDVD extends ComputerDecorator{

    Computer dvdCom;

    public ComDVD(Computer com) {
        this.dvdCom = com;
    }
    @Override
    public String description() {
        return dvdCom.description() + " and a DVD";
    }
}
