package com.jaggz01.chainofresponsibility;

public class HandlerRequest {

    int x;
    int y;
    String handlerRequestType;

    public HandlerRequest(int x, int y, String handlerRequestType) {
        this.x = x;
        this.y = y;
        this.handlerRequestType = handlerRequestType;
    }

    public String getHandlerRequestType() {
        return handlerRequestType;
    }

    public void setHandlerRequestType(String handlerRequestType) {
        this.handlerRequestType = handlerRequestType;
    }

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public int getX() {return x;}
    public int getY() {return y;}
}
