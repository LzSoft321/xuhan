package pers.xuhan.java.designpattern_设计模式.chainofresponsibilitypattern_责任链;

//封装请求的类Request
public class Request {
    String requestStr;

    public String getRequest() {
        return requestStr;
    }

    public void setRequest(String request) {
        this.requestStr = request;
    }
    
}