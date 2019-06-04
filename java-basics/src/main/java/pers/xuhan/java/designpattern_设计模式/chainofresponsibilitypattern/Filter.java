package pers.xuhan.java.designpattern_设计模式.chainofresponsibilitypattern;

/*
 * 定义接口Filter,具体的过滤规则需要实现这个接口，最后一个参数添加的意义是我们在Main函数中:
 * fc.doFilter(request, response,fc);执行这一步的时候可以按照规则链条一次使用三个过滤规则对字符串进行处理
 * 因为
 * 
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain chain);
}