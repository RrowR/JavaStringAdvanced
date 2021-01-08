package com.itheima.demo01;

public class Demo01Equals {
    public static void main(String[] args) {
    /**
     *Person默认继承了Object类，所以可以直接使用Object的equals方法
     * boolean equals(Object obj)   对比两个对象的值是否相等
     * equals原码：
     *     public boolean equals(Object obj) {
     *         return (this == obj);
     *     }
     *     参数：
     *          Object obj
     *     方法体:
     *          ==:比较运算符，返回的就是一个布尔值 true false
     *          基本数据类型:比较的是值
     *          引用数据类型:比较的是两个对象的地址值
     *      this是谁？
     *          那个对象调用了这个方法，那么this就代表的是这个对象;    下面是p1调用了equals方法，那么这个this就是p1   p2就是传入的参数obj
     *       this==obj --> p1==p2
     *
     *
     */
        Person p1 = new Person("镜华", 12);
        Person p2 = new Person("美美", 10);
        boolean b = p1.equals(p2);
        System.out.println(b);

    }
}
