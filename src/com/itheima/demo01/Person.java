package com.itheima.demo01;

public class Person {
    private String name;
    private int age;

    //无参构造
    public Person() {
    }

    //有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 直接打印对象的地址值没有意义，我们需要重写Object类的toString方法
     * 我们想打印对象的属性
     */
    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
    /*@Override
    public String toString() {
        return "Person{name="+name+",age="+age+"}";
    }*/
}
