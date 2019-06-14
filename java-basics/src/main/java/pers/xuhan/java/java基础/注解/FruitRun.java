package pers.xuhan.java.java基础.注解;

import pers.xuhan.java.javabasic.注解.Apple;
import pers.xuhan.java.javabasic.注解.FruitInfoUtil;

/**
 * 输出结果
 */
public class FruitRun {
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}