package com.ictec.dpatterns;

public class ComplexNameClass implements ComplexNameInterface{

    private String fName;
    private String lName;

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
