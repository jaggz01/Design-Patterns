package com.jaggz01.chainofresponsibility;

public class AddHandler implements Handler{

    Handler nextHandler;
    public AddHandler(Handler h) {
        nextHandler = h;
    }

    @Override
    public void process(HandlerRequest request) {
        if(request.getHandlerRequestType().equals(HandlerRequestType.ADD.getType())) {
            System.out.println("Handled by AddHandler");
        } else if(nextHandler != null)  {
            nextHandler.process(request);
        } else {
            System.out.println("Cannot Handle request");
        }
    }
}
