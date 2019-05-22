package pers.xuhan.java.designpattern.templatepattern;

public class Test {

    public static void main(String[] args) {

        // 咖啡制作
        Beverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();  // 调用模版
        System.out.println("\n***********************\n");
        // 茶制作
        Beverage tea = new Tea();
        tea.prepareBeverageTemplate(); // 调用模版
    }
}
