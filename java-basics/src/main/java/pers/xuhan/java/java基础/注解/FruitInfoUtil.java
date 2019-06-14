package pers.xuhan.java.java基础.注解;

import pers.xuhan.java.javabasic.注解.FruitColor;
import pers.xuhan.java.javabasic.注解.FruitName;
import pers.xuhan.java.javabasic.注解.FruitProvider;

import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";
        
        Field[] fields = clazz.getDeclaredFields();
        
        for(Field field :fields){
            if(field.isAnnotationPresent(pers.xuhan.java.javabasic.注解.FruitName.class)){
                pers.xuhan.java.javabasic.注解.FruitName fruitName = (pers.xuhan.java.javabasic.注解.FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(pers.xuhan.java.javabasic.注解.FruitColor.class)){
                pers.xuhan.java.javabasic.注解.FruitColor fruitColor= (pers.xuhan.java.javabasic.注解.FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}