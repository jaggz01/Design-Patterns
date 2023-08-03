package com.jaggz01.chainofresponsibility;

public class MultiplyHandler implements Handler{

    Handler nextHandler;
    public MultiplyHandler(Handler h) {
        nextHandler = h;
    }

    @Override
    public void process(HandlerRequest request) {
        if(request.getHandlerRequestType().equals(HandlerRequestType.MULTIPLY.getType())) {
            System.out.println("Handled by MultiplyHandler");
        } else if(nextHandler != null) {
            nextHandler.process(request);
        } else {
            System.out.println("Cannot Handle Request");
        }
    }
}
