package pers.xuhan.java.designpattern_设计模式.chainofresponsibilitypattern_责任链;

//封装响应信息的类Response
public class Response {
    String responseStr;

    public String getResponse() {
        return responseStr;
    }

    public void setResponse(String response) {
        this.responseStr = response;
    }
    
}