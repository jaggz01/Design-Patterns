package com.jaggz01.chainofresponsibility;

public enum HandlerRequestType {

    MULTIPLY ("Multiply"),
    ADD ("Add"),
    SUBTRACT ("Subtract"),
    LOG ("Log");

    private String type;

    HandlerRequestType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
