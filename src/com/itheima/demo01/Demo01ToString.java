package com.itheima.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * java.lang.Object类是所有类中的超类,所以任何类都可以调用这个包下的方法不需要引用
 */

public class Demo01ToString {
    public static void main(String[] args) {
        /**
         * Person默认继承了Object类，可以直接使用这个超类下的方法
         * 例如toString方法
         */
        Person person = new Person("hxd", 22);
        String s = person.toString();
        System.out.println(s);//com.itheima.demo01.Person@1b6d3586
        //直接打印对象的名字就是调用toString方法，打印的值是一模一样的
        System.out.println(person);         //com.itheima.demo01.Person@1b6d3586
        /**
         * PS:在打印对象的时候，如果对象没有重写Object类的toString方法，则会打印对象
         * 如果随便一个类重写了toString方法，则会按照重写的方法进行打印
         */

        Random r = new Random();
        System.out.println(r);      //java.util.Random@4554617c     //没有重写toString方法
        Scanner scanner = new Scanner(System.in);       //java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\,][decimal separator=\.][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\Q�\E][infinity string=\Q∞\E]
        //scanner打印的不是地址值，说明了Scanner重写了toString方法
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);       //[1, 2]    重写了toString方法






    }
}
