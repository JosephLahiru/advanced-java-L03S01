package com.ictec.dpatterns;

public class SimpleToComplexAdaptor implements ComplexNameInterface{
    //this must handle the client request (Simple Name)
    //this must convert the client request to backend requirement/request

    SimpleNameClass sn;

    public SimpleToComplexAdaptor(SimpleNameClass sn) {
        this.sn = sn;
        this.fName = sn.getName().split(" ")[0];
        this.lName = sn.getName().split(" ")[1];
    }

    private String fName, lName;

    @Override
    public String getFName() {
        return fName;
    }

    @Override
    public void setFName(String fName) {
        this.fName = fName;
    }

    @Override
    public String getLName() {
        return lName;
    }

    @Override
    public void setLName(String lName) {
        this.lName = lName;
    }
}
