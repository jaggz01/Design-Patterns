package com.jaggz01.observer.design;

import java.util.ArrayList;
import java.util.List;

public class IPhoneSubject implements Subject{

    List<Observer> observers = new ArrayList();
    String value = "";
    @Override
    public void attach(Observer o){
        observers.add(o);
    }
    @Override
    public void detach(Observer o) {
        if(observers.contains(o))
            observers.remove(o);
    }
    @Override
    public String getValue(){
        return value;
    }
    @Override
    public void setValue(String value) {
        this.value = value;
        this.notification();
    }
    @Override
    public void notification(){
        for(Observer o : observers) {
            o.update();
        }
    }

}
