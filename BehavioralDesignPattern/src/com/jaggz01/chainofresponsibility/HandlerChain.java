package com.jaggz01.chainofresponsibility;

import com.sun.net.httpserver.Filter;

public class HandlerChain {

    Handler h;
    public HandlerChain() {
        buildChain();
    }

    public void buildChain() {
        h = new AddHandler(new MultiplyHandler(new SubtractHandler(null)));
    }

    public void process(HandlerRequest  request) {
        h.process(request);
    }
}
