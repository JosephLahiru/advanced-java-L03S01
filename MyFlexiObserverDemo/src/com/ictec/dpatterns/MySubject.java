package com.ictec.dpatterns;

public interface MySubject {
    public void registerObserver(MyObserver obs); //To register Observers
    public void removeObserver(MyObserver obs); //To remove Observers

    public void notifyObservers(); //To notify Observers
}
