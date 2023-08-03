package com.jaggz01.chainofresponsibility;

public class SubtractHandler implements Handler{

    Handler nextHandler;
    public SubtractHandler(Handler h) {
        nextHandler = h;
    }

    @Override
    public void process(HandlerRequest request) {
        if(request.getHandlerRequestType().equals(HandlerRequestType.SUBTRACT.getType())) {
            System.out.println("Handled by subtract handler");
        } else if(nextHandler != null) {
            nextHandler.process(request);
        } else {
            System.out.println("Cannot handle request");
        }
    }
}
