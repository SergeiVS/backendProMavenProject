package org.xmlConfig.xmlExample;

public class HelloWorld {
private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "org.xmlExample.HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
