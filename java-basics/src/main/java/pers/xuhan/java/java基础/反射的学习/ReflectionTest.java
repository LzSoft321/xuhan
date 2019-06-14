package pers.xuhan.java.java基础.反射的学习;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;

public class ReflectionTest {
    @Test
    public void testClass() {
       Class clazz = null;
       
       //1.得到Class对象
       clazz = Person.class;

        //2.返回字段的数组
        Field[] fields = clazz.getDeclaredFields();
       System.out.println();  //插入断点
    }


    @Test
    public void testClass1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = null;

        //1.通过类名
        clazz = Person.class;


        //2.通过对象名
        //这种方式是用在传进来一个对象，却不知道对象类型的时候使用
        Person person = new Person();
        clazz = person.getClass();
        //上面这个例子的意义不大，因为已经知道person类型是Person类，再这样写就没有必要了
        //如果传进来是一个Object类，这种做法就是应该的
        Object obj = new Person();
        clazz = obj.getClass();

        //3.通过全类名(会抛出异常)
        //一般框架开发中这种用的比较多，因为配置文件中一般配的都是全类名，通过这种方式可以得到Class实例
        String className=" pers.xuhan.java.javabasic.ReflectStudy.Person";
        clazz = Class.forName(className);

        //利用Class对象的newInstance方法创建一个类的实例
        Object obj1 =  clazz.newInstance();
        System.out.println(obj);


        //字符串的例子
        clazz = String.class;

        clazz = "javaTest".getClass();

        clazz = Class.forName("java.lang.String");

        System.out.println();
    }


    @Test
    public void testClassLoader() throws ClassNotFoundException, FileNotFoundException {
        //1. 获取一个系统的类加载器(可以获取，当前这个类PeflectTest就是它加载的)
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);


        //2. 获取系统类加载器的父类加载器（扩展类加载器，可以获取）.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);


        //3. 获取扩展类加载器的父类加载器（引导类加载器，不可获取）.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);


        //4. 测试当前类由哪个类加载器进行加载（系统类加载器）:
        classLoader = Class.forName("pers.xuhan.java.javabasic.ReflectionTest")
                .getClassLoader();
        System.out.println(classLoader);


        //5. 测试 JDK 提供的 Object 类由哪个类加载器负责加载（引导类）
        classLoader = Class.forName("java.lang.Object")
                .getClassLoader();
        System.out.println(classLoader);
    }
    @Test
    public void testClassLoader1() throws FileNotFoundException{
        //src目录下，直接加载
        InputStream in1 = null;
        in1 = this.getClass().getClassLoader().getResourceAsStream("test1.txt");

        //放在内部文件夹，要写全路径
        InputStream in2 = null;
        in2 = this.getClass().getClassLoader().getResourceAsStream("pers/xuhan/java/javabasic/test2.txt");
    }

}