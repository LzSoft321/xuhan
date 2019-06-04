package pers.xuhan.java.designpattern_设计模式.templatepattern;

//优点：
//（1）具体细节步骤实现定义在子类中，子类定义详细处理算法是不会改变算法整体结构。
//（2）代码复用的基本技术，在数据库设计中尤为重要。
//（3）存在一种反向的控制结构，通过一个父类调用其子类的操作，通过子类对父类进行扩展增加新的行为，符合“开闭原则”。
//不足：
// 每个不同的实现都需要定义一个子类，会导致类的个数增加，系统更加庞大。
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
