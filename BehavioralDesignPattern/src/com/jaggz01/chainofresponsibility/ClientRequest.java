package com.jaggz01.chainofresponsibility;

public class ClientRequest {
    public static void main(String[] args) {
        HandlerRequest request = new HandlerRequest(2, 3, HandlerRequestType.ADD.getType());
        HandlerChain chain = new HandlerChain();
        chain.process(request);

        HandlerRequest request1 = new HandlerRequest(2, 3, HandlerRequestType.MULTIPLY.getType());
        chain.process(request1);

        HandlerRequest request2 = new HandlerRequest(2, 3, HandlerRequestType.LOG.getType());
        chain.process(request2);
    }
}
