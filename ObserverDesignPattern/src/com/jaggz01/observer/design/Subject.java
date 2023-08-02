package com.jaggz01.observer.design;

public interface Subject {

    void attach(Observer o);
    void detach(Observer o);
    String getValue();
    void setValue(String value);
    void notification();
}
